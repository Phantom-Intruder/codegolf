n=[-4,-1,0,3,10]
i,j,a=0,len(n)-1,[]

while i<=j:
    q,w=n[i]**2,n[j]**2
    if q<w:a=[w]+a;j-=1
    elif q>w:a=[q]+a;i+=1
    elif i==j:a=[q]+a;break
    else:a=[q]+a;a=[w]+a;j-=1;i+=1

print(a)