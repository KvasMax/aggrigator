package mini.max.core

interface BaseView<P : BaseViewModel> {

    val layoutId: Int

    val viewModel: P

}