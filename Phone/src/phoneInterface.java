//Create Interface and implement it via abstract class
//
//-> Create Phone Interface, it should have call, text,
// showCallHistory and showTextHistory functions.


public class  phoneInterface {
    private String call;
    private String text;



    public phoneInterface(String call, String text){
       this.call = call;
       this.text = text;
   }
    public String getCall() {
        return call;
    }

    public String getText() {
        return text;
    }

    public void setCall(String call) {
        this.call = call;
    }
    public void setText(String text) {
        this.text = text;
    }


    public void showTextHistory(){

   }

}
