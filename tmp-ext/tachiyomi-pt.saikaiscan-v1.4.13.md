# Extension Validation Report

- Extension: tachiyomi-pt.saikaiscan-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 273341846992513187
- Source name: Saikai Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Contos de Demônios e Deuses (`.../contos-de-demonios-e-deuses`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Contos de Demônios e Deuses (`.../contos-de-demonios-e-deuses`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Eu Selarei os Céus (`.../eu-selarei-os-ceus`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Sistema Metropolitano (`.../sistema-metropolitano`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 5 Elementos (`.../5-elementos-5e`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Contos de Demônios e Deuses (`.../contos-de-demonios-e-deuses`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Contos de Demônios e Deuses (`.../contos-de-demonios-e-deuses`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 906 | Capítulo 1 - Renascimento (`.../capitulo-01-renascimento`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Contos de Demônios e Deuses, URL=`.../contos-de-demonios-e-deuses` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3-beta.housesaikai.net/.../contos-de-demonios-e-deuses.webp` (image/webp (encoding: lossy), 32326 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../contos-de-demonios-e-deuses` |  |  |  |
| details thumbnail URL | PASS | `https://s3-beta.housesaikai.net/.../contos-de-demonios-e-deuses.webp` |  |  |  |
| details author | PASS | Mad Snail |  |  |  |
| details artist | PASS | Jiang Ruotai |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia, Reencarnação, Romance, Sobrenatural, Wuxia, Xianxia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nie Li, o mais poderoso Espiritualista Demoníaco e estando no topo do mundo marcial, perde sua vida durante a batalha com o Imperador Sábio e as seis bestas de nível divino, e sua alma volta ao passado para quando ele tinha 13 anos. Embora ele seja o mais fraco em sua classe, com o talento mais baixo no reino da alma Vermelho – o mais fraco dos reinos – com a ajuda de seu vasto conhecimento acumulado na sua vida passada, cresce mais rápido do que todos. Agora, ele irá tentar proteger a cidade que no futuro será invadida pelas bestas e que acabou sendo destruída, assim como sua amada, seus amigos e sua família que morreram pelo ataque das mesmas, e destruir a família Sagrada que abandonaram seus deveres e traíram a cidade em sua vida passada. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 906 chapters |  |  |  |
| chapter dates | PASS | 906 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s3-beta.housesaikai.net/.../TDG_01_-__1.webp` (image/webp (encoding: lossy), 244880 bytes, 800x1133) |  |  |  |
