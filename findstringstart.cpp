   string str=input1;
    int count=0;
    int pos=str.find(" ");
    int len=str.length();
    string str1[len];
    for(int i=0;str[i]!='\0';i++)
   if(str[i]==' '){
       count =count+1;
   }
   for(int i=0;str[i]!='\0';i++){
       if(str[i]>97 && str[i]<122)
       str[i]=str[i]-32;
   }
   for(int i=0;str[i]!='\0';i++)
   {
       if(str[i]==pos){
           str1[i]=str.substr(0,pos);
       }
   }
   for(int i=0;str1[i]!=pos;i++)
   cout<<str1<<endl;
   
    return 0;

}