interface IMovable{

    public void moveRight(Character character){
        System.out.println(character.getName() + ": moves right");
    };
    public void moveLeft(){
        System.out.println(character.getName() + ": moves left");
    };
    public void moveForward(){
        System.out.println(character.getName() + ": moves forward");
    };
    public void moveBack(){
        System.out.println(character.getName() + ": moves back");
    };


}