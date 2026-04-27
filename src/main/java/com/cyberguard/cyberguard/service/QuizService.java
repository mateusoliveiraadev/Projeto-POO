package com.cyberguard.cyberguard.service;

import com.cyberguard.cyberguard.entity.Pergunta;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuizService {

    public List<Pergunta> getPerguntas() {
        return Arrays.asList(
            new Pergunta("Phishing é um tipo de golpe?", "sim", "Phishing é uma técnica de fraude online que busca enganar o usuário para obter informações confidenciais, como senhas e dados bancários."),
            new Pergunta("Senha deve ser compartilhada?", "nao", "Nunca compartilhe suas senhas. Elas são a chave para suas informações pessoais e financeiras."),
            new Pergunta("É seguro clicar em links de e-mails desconhecidos?", "nao", "Evite clicar em links de e-mails ou mensagens de remetentes desconhecidos, pois podem levar a sites maliciosos."),
            new Pergunta("Antivírus protege contra todos os tipos de malware?", "nao", "Antivírus são importantes, mas não garantem 100% de proteção. Mantenha seu software atualizado e seja cauteloso online."),
            new Pergunta("Usar senhas fortes e únicas é importante?", "sim", "Senhas fortes (combinação de letras, números e símbolos) e únicas para cada serviço aumentam significativamente sua segurança."),
            new Pergunta("É seguro usar Wi-Fi público para transações bancárias?", "nao", "Redes Wi-Fi públicas são menos seguras e podem ser monitoradas. Evite realizar transações financeiras ou acessar dados sensíveis nelas."),
            new Pergunta("Atualizar o software regularmente aumenta a segurança?", "sim", "Atualizações de software frequentemente incluem correções de segurança importantes que protegem contra novas ameaças."),
            new Pergunta("Compartilhar informações pessoais em redes sociais é sempre seguro?", "nao", "Pense bem antes de compartilhar informações pessoais em redes sociais. Dados demais podem ser usados por criminosos."),
            new Pergunta("Verificar se um site tem \'https\' é um bom sinal de segurança?", "sim", "O \'https\' indica que a conexão com o site é criptografada, tornando-a mais segura para troca de informações." ),
            new Pergunta("É aceitável usar a mesma senha para várias contas?", "nao", "Usar a mesma senha em várias contas é um risco enorme. Se uma for comprometida, todas as outras estarão em perigo.")
        );
    }

    public int corrigir(List<String> respostasUsuario) {
        List<Pergunta> perguntas = getPerguntas();
        int pontuacao = 0;
        int numRespostas = Math.min(respostasUsuario.size(), perguntas.size());

        for (int i = 0; i < numRespostas; i++) {
            if (respostasUsuario.get(i) != null && 
                respostasUsuario.get(i).equalsIgnoreCase(perguntas.get(i).getRespostaCorreta())) {
                pontuacao++;
            }
        }
        return pontuacao;
    }
}
