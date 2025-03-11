# MVVM 架构示例

用最简单的样例代码实现MVVM架构以便理解原理

## View (XML + Activity)

* 在 XML 中使用 Data Binding 绑定了 ViewModel，并通过 android:onClick 或 View.OnClickListener 将用户操作传递给 ViewModel。

* 在 Activity 中观察 LiveData，接收数据变化并更新 UI。

## ViewModel

* ViewModel 编写业务逻辑，并通过 LiveData 暴露数据。

## 双向数据流

* View → ViewModel：通过 Data Binding 或事件监听，用户操作传递到 ViewModel。

* ViewModel → View：ViewModel 通过 LiveData 将数据变化通知给 Activity，Activity 更新 UI。

