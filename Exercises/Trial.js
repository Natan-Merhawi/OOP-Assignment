const getPlayers = async ()=>{
    console.log('Game Time') 
    Referees= await fetch ('http://dummyjson.com/products')
    Referees= await Referees.json()
    console.log(Referees) 
    console.log('Start')
}

getPlayers()