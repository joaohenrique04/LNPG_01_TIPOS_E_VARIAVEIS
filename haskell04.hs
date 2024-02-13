main :: IO ()
main = do
    putStrLn "Vamos descobrir se você é de maior ou não!"
    putStrLn "Digite sua idade:"
    vlr <- getLine
    let idade = read vlr :: Int
    if idade < 18
        then putStrLn "Você é menor de idade"
        else putStrLn "Você é maior de idade, cuidado em!"
