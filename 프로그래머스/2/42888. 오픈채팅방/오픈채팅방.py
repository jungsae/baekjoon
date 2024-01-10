def solution(record):
    users = {}
    answer=[]

    for info in record:
        spl=info.split()
        if spl[0] == "Enter":
            users[spl[1]]=spl[2]
        elif spl[0] == "Change":
            users[spl[1]]=spl[2]

    for info in record:
        spl=info.split()
        if spl[0] == "Enter":
            answer.append(f'{users.get(spl[1])}님이 들어왔습니다.')
        elif spl[0] == "Leave":
            answer.append(f'{users.get(spl[1])}님이 나갔습니다.')
    
    return answer