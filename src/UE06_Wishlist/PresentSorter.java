package UE06_Wishlist;

public class PresentSorter {
    public void sortPresentsByDesire(Present[] presents) {
      /* for(int i=1; i< presents.length; i++){ //1e Schleife
            for (int j=i; j>0; j--){//2e Schleife für Vergleich
              //ob es getauscht werden ist
                if(presents[j].desire <presents[j-1].desire){
                    Present n=presents[j];
                    presents[j]=presents[j-1];
                    presents[j-1]=n;
                }
                else break;
            }
        }*/
        //bubble sort:
        for(int i=0; i< presents.length; i++){//Schleife für die Durchläufe
            //boolean change=false;
            for (int j=0; j< presents.length-i-1; j++){//Schleife fürs Vergleich, -i-1 dann schaut er letzte Element nicht mehr, weil er schon vergliechen ist
                if (presents[j].desire>presents[j+1].desire){
                    Present n=presents[j];
                    presents[j]=presents[j+1];
                    presents[j+1]=n;
                    //change=true;
                }
            }
            //if (change==false){
            //    break;
            //}
        }
    }
}
