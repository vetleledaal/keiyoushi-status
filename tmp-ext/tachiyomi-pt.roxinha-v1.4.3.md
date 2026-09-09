# Extension Validation Report

- Extension: tachiyomi-pt.roxinha-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3961079268907869519
- Source name: Roxinha
- Source language: pt-BR
- Selected manga input: popular offset 0: O Mago do Infinito (`.../100`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | O Mago do Infinito (`.../100`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Regressão Absoluta (`.../378`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | O Eterno Supremo (`.../3525`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | O Herói Lendário é um Aluno Com Honras da Academia (`.../3395`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | O Mago do Infinito (`.../100`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | O Mago do Infinito (`.../100`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 344 | Capítulo 1 (`.../10221`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Mago do Infinito, URL=`100` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://roxinha.online/.../cover_1771106979813.jpg` (image/webp (encoding: lossy), 103484 bytes, 709x1024; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `100` |  |  |  |
| details thumbnail URL | PASS | `https://roxinha.online/.../cover_1771106979813.jpg` |  |  |  |
| details author | PASS | kiraz, Chi-U Kim |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia, Drama, Magia, Escolar, Sobrenatural, Mistério, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **O Mago do Infinito**  <br>Abandonado ao nascer em um estábulo, Shirone foi criado pelos humildes camponeses que o adotaram como um filho. Desde cedo, ele demonstrou uma perspicácia fora do comum, aprendendo a ler antes mesmo de saber escrever e absorvendo cada história que lhe era contada. Ao visitar a cidade pela primeira vez, seus olhos se depararam com a magia em pleno vigor – feitiços que cintilavam no ar, criaturas encantadas e rituais que pareciam desafiar as leis da natureza. Aquela visão incendiou uma curiosidade insaciável e plantou, em seu coração, o sonho ardente de se tornar um mago.<br><br>Entretanto, a metrópole revela-se um labirinto de hierarquias implacáveis, onde o poder é monopolizado pelos nobres e a magia é um privilégio reservado a poucos. Entre intrigas, conspirações e segredos sombrios, Shirone descobre, antes mesmo da maioridade, um lado oculto e perigoso desse mundo – uma teia de corrupção que ameaça engolir tudo o que ele ama.<br><br>Agora, armado apenas com sua inteligência afiada, a vontade de aprender e um desejo inabalável de mudar o destino, Shirone enfrentará provações que testarão sua coragem, sua moral e sua própria definição de magia. Em meio a batalhas épicas, alianças inesperadas e revelações que desafiam a própria realidade, ele lutará para provar que, mesmo nas trevas mais densas, um sonho pode iluminar o caminho para o infinito. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 344 chapters |  |  |  |
| chapter dates | PASS | 344 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
