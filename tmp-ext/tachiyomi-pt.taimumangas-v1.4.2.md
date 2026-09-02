# Extension Validation Report

- Extension: tachiyomi-pt.taimumangas-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8914871231496469978
- Source name: Taimu Mangas
- Source language: pt-BR
- Selected manga input: popular offset 0: Por Favor me dê Essa Chupeta (`.../568476022087`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Por Favor me dê Essa Chupeta (`.../568476022087`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Eu Era o Lixo (`.../150484308364`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Amor:Zero (`.../934109489739`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | A Bebê Esquilo é Boa em Tudo (`.../055412530103`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Por Favor me dê Essa Chupeta (`.../568476022087`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Por Favor me dê Essa Chupeta (`.../568476022087`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 96 | Capitulo 1 (`.../246872786759`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Por Favor me dê Essa Chupeta, URL=`568476022087` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.taimumangas.com/.../88c03161-f567-4940-8aef-5038a23b3fcd_md.webp` (image/webp (encoding: lossy), 58000 bytes, 400x572) |  |  |  |
| details identity | PASS | Details preserved selected URL `568476022087` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.taimumangas.com/.../88c03161-f567-4940-8aef-5038a23b3fcd_lg.webp` (image/webp (encoding: lossy), 110588 bytes, 600x858) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aventura, Reencarnação, Magia, Drama, Romance, Mistério, Comédia, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fui eliminada após ser traída por meu amigo mais confiável. Fechei os olhos e jurei me vingar, mas eu me tornei filha de um duque em Heiron, o império que tem estado em desavença com reino de Cillophia? O problema era: “Abuu!” “Oh, que chato. Basta levar sua chupeta. “Instintivamente chupei o que entrou na minha boca, abri abruptamente os olhos. “O que eu estava fazendo até agora?” Tive que chupar uma chupeta para que meu cérebro funcionasse bem! Sem chupeta, ela era apenas um bebê com a cabeça cheia de campos de flores! Esta foi a maior humilhação da grande maga Hella. “Já que as coisas são assim, vamos voltar depois de roubar informações classificadas.” Secretamente, sem ser visto por ninguém! Hoje, Sherina estava novamente rastejando desesperadamente entre pilares e árvores. “Aquela .. de quem é aquela garota? Quem está cuidando dessa garota assim?! ” O grito de raiva atrás de Sherina não era da sua conta.<br><br>Tipo: manhwa<br><br>Scanlator: Mango Scan BR |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 96 chapters |  |  |  |
| chapter dates | PASS | 96 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.taimumangas.com/.../001.webp` (image/webp (encoding: lossy), 38224 bytes, 285x399) |  |  |  |
