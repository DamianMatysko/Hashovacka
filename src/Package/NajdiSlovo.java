package Package;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NajdiSlovo {
    public String slovo;
    public int hashCode;

    public NajdiSlovo(String slovo, int hashCode) {
        this.slovo = slovo;
        this.hashCode = hashCode;
    }

    public String najdiRiesenie() {
        StringBuffer stringBuffer = new StringBuffer(slovo);
        int countOfSpaces=1;
        String binaryCode="";
        List<String> myList = new ArrayList<>();

        if (slovo.hashCode() == hashCode) {
            return slovo;
        }

        if (slovo.length()==1){
            return null;
        }

        for (int i=0;i<slovo.length()-1;i++){
            binaryCode += "1";
        }

        int foo = Integer.parseInt(binaryCode, 2);

        for (int i=1;i<=foo;i++){
            binaryCode=Integer.toBinaryString(i);

            for (;binaryCode.length()<slovo.length()-1;){
                binaryCode = "0"+binaryCode;
            }
            myList.add(binaryCode);
        }
        System.out.println(myList);

        for (int i=0;i<myList.size();i++) {
            stringBuffer = new StringBuffer(slovo);
            for (int j = 0; j < slovo.length() - 1; j++) {
                if (myList.get(i).charAt(j)=='1'){
                    stringBuffer.insert(j+countOfSpaces," ");
                    countOfSpaces++;
                }
            }
            countOfSpaces=1;
            System.out.println(stringBuffer.toString());
            if (stringBuffer.toString().hashCode() == hashCode) {
                return stringBuffer.toString();
            }
        }
        return null;
    }

    public String najdiRiesenieOldMethod() {
        StringBuffer stringBuffer = new StringBuffer(slovo);
        Set<String> mySet = new HashSet<String>();
        List<String> myList = new ArrayList<>();
/*
        for (int i = 1; i < slovo.length(); i++) {
            myList.add(stringBuffer.insert(i, " ").toString());
            stringBuffer.deleteCharAt(i);
        }

        for (int i = 1; i < slovo.length(); i++) {
            myList.add(stringBuffer.insert(i, " ").toString());
            for (int j = i + 2; j <= slovo.length(); j++) {
                myList.add(stringBuffer.insert(j, " ").toString());
                stringBuffer.deleteCharAt(j);
            }
            stringBuffer.deleteCharAt(i);
        }
 */
        for (int i = 1; i <= stringBuffer.length(); i++) {
            myList.add(stringBuffer.insert(i, " ").toString());
            for (int j = i + 1; j <= stringBuffer.length(); j++) {
                myList.add(stringBuffer.insert(j, " ").toString());
                for (int k = j + 1; k <= stringBuffer.length(); k++) {
                    myList.add(stringBuffer.insert(k, " ").toString());
                    stringBuffer.deleteCharAt(k);
                }
                stringBuffer.deleteCharAt(j);
            }
            stringBuffer.deleteCharAt(i);
        }

        System.out.println(myList);

        for (int a = 0; a < myList.size(); a++) {
                if (myList.get(a).hashCode() == hashCode) {
                    return myList.get(a);
                }
        }
        return null;
    }

    public static void main(String[] args) {
        //System.out.println(new NajdiSlovo("123456789987654321", "123 456 789 987 654 321".hashCode()).najdiRiesenieBinaryMethod());
        System.out.println(new NajdiSlovo("dnesranosomisielnavylet", "dnes rano som isiel na vylet".hashCode()).najdiRiesenie());
    }
}