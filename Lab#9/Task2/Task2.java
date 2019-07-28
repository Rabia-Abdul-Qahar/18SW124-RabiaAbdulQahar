class InvalidAgeException extends Exception{

	InvalidAgeException(String s){
		super(s);
	} 
}

class VotingMachine{

	String [] candidate_names;
	int votes[];

	public void addCandidates(String[] names){
		candidate_names=names;
		votes =new int[candidate_names.length];
		}

	public void castVote(int voterAge,String voterToCandidate)
		throws InvalidAgeException{
		if(voterAge<18){
			throw new InvalidAgeException("Invalid Age ");
				}
		else 
		{	for(int i=0;i<candidate_names.length;i++){
				if(candidate_names[i]==voterToCandidate)
				{votes[i]++;}
				}
		}
									}

	public void printResult(){

		for(int i=0;i<candidate_names.length;i++)
		{
				System.out.println(candidate_names[i]+"          "+votes[i]);
		}
						
							}
								}


class Task2{
		
		public static void main(String[] args) {
				
				VotingMachine obj=new VotingMachine();
				String [] names={"Wajiha","Sara","Rabia","Faisal"};

		try{	obj.addCandidates(names);
				obj.castVote(19,"Rabia");
				obj.castVote(20,"Rabia");
				obj.castVote(18,"Faisal");
				obj.printResult();}
				catch(InvalidAgeException exe){
					System.out.println(exe);
						}

				}
		}