class Solution {
    public String solution(String new_id) {

        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^\\.|\\.$", "");

        if (new_id.length() == 0)
            new_id = "a";

        if (new_id.length() >= 16)
            new_id = new_id.replaceAll("^(.{15}).*$", "$1");

        if (new_id.charAt(new_id.length()-1) == '.')
            new_id = new_id.substring(0,new_id.length()-1);

        if (new_id.length() <= 2)
            while(new_id.length() != 3){
                new_id = new_id.concat(new_id.substring(new_id.length()-1));
            }

        return new_id;
    }
}