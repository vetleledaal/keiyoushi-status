# Extension Validation Report

- Extension: tachiyomi-pt.tiamanhwa-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 28
- Lint: 0
- Warnings: 4
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 8823653003339002799
- Source name: Tia Manhwa
- Source language: pt-BR
- Selected manga input: latest offset 0: Upar até Satisfazer (`.../upar-ate-satisfazer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 13 | Upar até Satisfazer (`.../upar-ate-satisfazer`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 19 | Eu Sou um Vampiro (`.../eu-sou-um-vampiro`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Upar até Satisfazer (`.../upar-ate-satisfazer`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Upar até Satisfazer (`.../upar-ate-satisfazer`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 70 | Capítulo 1 (`https://tiamanhwa.com/.../capitulo-1 <redacted query values: style>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Upar até Satisfazer, URL=`.../upar-ate-satisfazer` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 33/33 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://tiamanhwa.com/.../dflazy.jpg` -> all 13 manga URLs (examples: `.../upar-ate-satisfazer`, `.../amor-de-cheerleader`, `.../a-conta-secreta-do-professor`) |  |  |  |
| thumbnail | FAIL | `https://tiamanhwa.com/.../dflazy.jpg` (image/jpeg, 695 bytes, 1x1); image is solid or nearly solid (pixel colors vary by at most 0 on the 0-255 RGB scale; fails at 8 or less) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../upar-ate-satisfazer` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tiamanhwa.com/.../Level-Up-Until-Satisfy-pornhwa-xxx.webp` (image/webp (container: extended), 47046 bytes, 600x800) |  |  |  |
| details author | PASS | Chakhansaenggak |  |  |  |
| details artist | PASS | Goenamul |  |  |  |
| details genres | PASS | ahegao, Anal, BDSM, Bondage, Escolar, Escrava, Exibicionismo, Grupo, Harém, Masturbação, Óculos, Orgasmo, Pau Grande, Peitos Grandes, Professor, Raio X, Virgem, Adulto, Comedia, Drama, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Durante uma festa regada a bebida, Min-chan, amigo da deusa Zin-ah, recebe um comentário devastador: “Seu pimentão é muito pequeno.” Arrasado, ele vê Zin-ah se afastar com desprezo — e pensa em desistir de tudo. No entanto, antes que caia na escuridão do desespero, algo extraordinário — algo vindo de um mundo de fantasia — começa a acontecer diante dos seus olhos.<br><br>De repente, Min-chan se encontra em um universo onde suas fraquezas ganham potencial: novas habilidades surgem, desafios eróticos e tarefas misteriosas exigem que ele “evolua” para superar seus limites. Enquanto lida com vergonha, desejo e transformação, ele terá que decidir se merece satisfação — e se a deusa que o desprezou poderá vê-lo de outro modo. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 70 chapters |  |  |  |
| chapter dates | PASS | 70 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 70 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | latest: `https://tiamanhwa.com/.../1` to `https://tiamanhwa.com` (1 redirects) |  |  |  |
| page load | PASS | `https://tiamanhwa.com/.../Ler-Level-Up-Until-Satisfy-Cap%C3%ADtulo-1-Online---Portugu%C3%AAs_1_part1.webp` (image/webp (encoding: lossy), 609640 bytes, 720x12000) |  |  |  |
