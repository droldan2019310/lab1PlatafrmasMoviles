public class ItemDataJ {
    Object originalValue;
    public ItemDataJ(Object originalValue){
        this.originalValue=originalValue;
    }

    public String getType(){

        if(this.originalValue instanceof String){
            return "cadena";
        }else if(this.originalValue instanceof Integer){
            return "entero";
        }else if(this.originalValue instanceof Boolean){
            return "booleano";
        }

        return null;
    }


    public String getInfo(){
        if(this.originalValue instanceof String){
            return "L"+((String) this.originalValue).length()+1;
        }else if(this.originalValue instanceof Integer){
            if((Integer) this.originalValue % 10 ==0){
                return "M10";
            }else if((Integer) this.originalValue % 5 ==0){
                return "M5";
            }else if((Integer) this.originalValue % 2 ==0){
                return "M2";
            }else{
                return null;
            }
        }else if(this.originalValue instanceof Boolean){
            if((Boolean) this.originalValue){
                return "Verdadero";
            }else{
                return "Falso";
            }
        }
        return null;
    }
}
