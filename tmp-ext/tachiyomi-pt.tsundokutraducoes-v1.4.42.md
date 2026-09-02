# Extension Validation Report

- Extension: tachiyomi-pt.tsundokutraducoes-v1.4.42
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
- Source ID: 2091088265283814173
- Source name: Tsundoku Traduções
- Source language: pt-BR
- Selected manga input: latest offset 0: Kage no Jitsuryokusha ni Naritakute (`.../kage-no-jitsuryokusha-ni-naritakute`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Kage no Jitsuryokusha ni Naritakute (`.../kage-no-jitsuryokusha-ni-naritakute`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 9 | Love is Bone (`.../love-is-bone`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 16 | Kage no Jitsuryokusha ni Naritakute (`.../kage-no-jitsuryokusha-ni-naritakute`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 11 | Hinowa ga Yuku (`.../hinowa-ga-yuku`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Kage no Jitsuryokusha ni Naritakute (`.../kage-no-jitsuryokusha-ni-naritakute`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kage no Jitsuryokusha ni Naritakute (`.../kage-no-jitsuryokusha-ni-naritakute`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 83 | Cap. 01 (`.../kage-no-jitsuryokusha-ni-naritakute-cap-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kage no Jitsuryokusha ni Naritakute, URL=`.../kage-no-jitsuryokusha-ni-naritakute` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 56/56 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 56/56 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../Shadow_Capa_V18.jpg <redacted query values: resize>` (image/jpeg, 20667 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kage-no-jitsuryokusha-ni-naritakute` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../Shadow_Capa_V18.jpg` (image/jpeg, 808271 bytes, 1800x2560) |  |  |  |
| details author | PASS | Aizawa Daisuke |  |  |  |
| details artist | PASS | SAKANO Anri |  |  |  |
| details genres | PASS | Ação, Comédia, Fantasia, Harém, Isekai, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Da mesma forma que todos já adoraram heróis em sua infância, um certo jovem admirava aqueles que agiam nas sombras. Depois de passar a vida inteira escondendo sua verdadeira força e agindo como um personagem qualquer, enquanto persistia treinando noite após noite, ele reencarnou em um novo mundo repleto de magia e conquistou o poder absoluto! Um jovem que apenas finge ser um herói nas sombras, suas subordinadas que cometem mal-entendidos e uma poderosa organização secreta que estava no caminho… Esta é a história de um jovem que sempre amou o poder escondido nas sombras e que acabou reinando sobre a escuridão existente em um novo mundo.<br><br>Nome alternativo: A Eminência nas Sombras; The Eminence in Shadow; To Be a Power in The Shadow |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | PASS | 83 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i0.wp.com/.../0-capa-min.jpg <redacted query values: resize and ssl>` (image/webp (encoding: lossy), 159706 bytes, 975x1400) |  |  |  |
