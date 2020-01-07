# TMP

## On Creating Generic Arrays Directly Being Not-Allowed in Java

Code No.1:

    List<Integer>[] array = (List<Integer>[]) new Object[size];     // Disallowed

Object数组类型已经确定，泛型数组投射（Cast）无法改变Object数组类型，这将导致泛型数组类型错误。

Code No.2:

    E[] array = (E[]) new Object[size];                             // Allowed

E[]是无边界的泛型数组，编译器会将该语句改写为：

    Object[] array = (Object[]) new Object[size];

此即Java实现泛型的擦除（Erasure）方式。因为投射前后都是Object类型，因此不会发生类型错误。

Code No.3:

    List<Integer>[] array = (List<Integer>[]) new ArrayList[size];  // Allowed

ArrayList[size]是原生类型数组，因此可以通过投射转换成泛型数组。实际上编译器将其改写为：

    List[] array = (List[]) new ArrayList[size];

List是ArrayList的父类。在Java中数组时协变的，即允许父类类型数组接收子类类型数组，

Code No.4:

    List<Integer>[] array = new ArrayList<Integer>[size];           // Disallowed

此即直接创建泛型数组的语句，编译器将不会执行。
