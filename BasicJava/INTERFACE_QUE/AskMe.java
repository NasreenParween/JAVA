import java.util.Random;

class Questions implements SharedConstants{
	
	Random r1=new Random();
	int ask()
	{
		int prob=(int)(100*r1.nextDouble());
		if(prob<30)
			return NO;
		else if(prob<60)
			return YES;
		else if(prob<75)
			return LATER;
		else if(prob<98)
			return SOON;
		else 
			return NEVER;
	}
}
public class AskMe implements SharedConstants {
	 static void answer(int result){
		 switch(result) {
		 case NO: System.out.println("NO");
		          break;
		 case YES: System.out.println("YES");
                   break;
		 case MAYBE: System.out.println("MAYBE");
                    break;
		 case LATER: System.out.println("LATER");
                     break;
		 case SOON: System.out.println("SOON");
                    break;
		 case NEVER: System.out.println("NEVER");
                     break;
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Questions q= new Questions();
       answer(q.ask());
       answer(q.ask());
       answer(q.ask());
       answer(q.ask());

	}

}
