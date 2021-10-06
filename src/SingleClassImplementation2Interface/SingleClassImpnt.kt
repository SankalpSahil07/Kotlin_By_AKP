package SingleClassImplementation2Interface

interface FirstClass{
       fun showClass(){
              println("First Class Shown")
       }
}
interface SecondClass{
       fun showClass2(){
              println("SecondClass Show")
       }
}
  class FetchAll: FirstClass, SecondClass{
         override fun showClass() {
                super<FirstClass>.showClass()
                super<SecondClass>.showClass2()
         }
  }