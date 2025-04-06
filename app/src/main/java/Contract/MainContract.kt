package Contract

import Model.dataMain

interface MainContract {

    interface Presenter{

        fun onAttach(view :View)
        fun onDetach()

    }

    interface View{
        fun showStudentData(data :List<dataMain>)
    }

}