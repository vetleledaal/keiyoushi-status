# Extension Validation Report

- Extension: tachiyomi-pt.fenixproject-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 8852449878379679769
- Source name: Fenix Project
- Source language: pt-BR
- Selected manga input: latest offset 0: O Campo Esquecido (`.../o-campo-esquecido`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 99 | Meu Amado Opressor (`.../meu-amado-opressor`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 78 | Match Inesperado (`.../match-inesperado`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 94 | O Campo Esquecido (`.../o-campo-esquecido`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 83 | Nesta Vida, Você Será o Cão de Caça (`.../nesta-vida-voce-sera-o-cao-de-caca`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | O Campo Esquecido (`.../o-campo-esquecido`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | O Campo Esquecido (`.../o-campo-esquecido`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 34 | Capítulo 01 (`https://fenixproject.site/.../capitulo-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 61 |  |  | 1-10s |

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
| popular listing | PASS | 99 entries |  |  |  |
| latest listing | PASS | 94 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Campo Esquecido, URL=`.../o-campo-esquecido` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 355/355 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 355/355 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fenixproject.site/.../Campo-350x476.png` (image/png, 328038 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-campo-esquecido` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://fenixproject.site/.../Campo.png` (image/png, 1897906 bytes, 864x1236) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Angústia, Dark Romance, Drama, Fantasia, Histórico, Josei, Tragédia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “Todos os dias, eu rezo para que este amor morra… Para que eu te ame apenas até hoje e que amanhã esse amor tenha desaparecido.” Thalia Roem Ghirta é uma princesa imperial trágica, fruto de um caso extraconjugal e criada em um palácio que nunca a aceitou de verdade. Cercada por pais indiferentes, meio-irmãos hostis e servos que a desprezavam, Thalia cresceu marcada pela negligência. Para se proteger, aprendeu a mostrar seus espinhos a qualquer um que se aproximasse. No entanto, diante de uma pessoa, até mesmo ela se torna completamente indefesa. Varkas Raedgo Siekhan, um nobre senhor do Oriente, é vassalo da família imperial e herdeiro de uma casa grão-ducal. Criado sob a implacável expectativa de perfeição, suas emoções foram embotadas por um treinamento que beirava o abuso. Ele vivia apenas pela honra e pelo dever de sua família. Para cumprir uma promessa feita à antiga imperatriz, Varkas fica noivo de Ayla, meia-irmã de Thalia. Consumida pelo desespero, Thalia começa a desmoronar lentamente. Mas seu amor, outrora fadado apenas à morte, logo encontra uma reviravolta inesperada…<br><br>Dando continuidade a uma obra que gostamos muito e que estava abandonada pelo agregador que fazia! Aproveitem a leitura! <3 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | PASS | 34 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 34 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fenixproject.site/.../01.webp` (image/webp (encoding: lossy), 560082 bytes, 720x5000) |  |  |  |
