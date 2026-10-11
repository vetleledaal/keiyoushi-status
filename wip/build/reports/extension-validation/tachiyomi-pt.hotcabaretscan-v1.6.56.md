# Extension Validation Report

- Extension: tachiyomi-pt.hotcabaretscan-v1.6.56
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8778000927023046626
- Source name: Hot Cabaret Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Just Give Me a Child (`.../809`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Just Give Me a Child (`.../809`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Alpha no Dakedo Konyakusha ga Omega no Sensei de Asoko ga Taihendesu (`.../845`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | The masquerade (`.../818`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Omega ni Dake wa Naritakunai!! ~Isekai Tensei Shitara Ane no BL Manga no Nakadeshita~ (`.../718`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Just Give Me a Child (`.../809`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Just Give Me a Child (`.../809`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 34 | Capítulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 45 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Just Give Me a Child, URL=`809` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://hotcabaretscan.com/.../634d9b76639f8_external_cover.webp` (image/webp (encoding: lossy), 96022 bytes, 720x960) |  |  |  |
| details identity | PASS | Details preserved selected URL `809` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hotcabaretscan.com/.../634d9b76639f8_external_cover-193x278.webp` (image/webp (encoding: lossy), 11892 bytes, 193x278) |  |  |  |
| details author | PASS | Seo woo |  |  |  |
| details artist | PASS | Seo woo |  |  |  |
| details genres | PASS | Ativo, Drama, Hétero, Maduro, Manhwa, Omegaverse, Romance, Smut, Hot cabaret |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cha Sia, uma herdeira alfa, tem evitado ômegas desde que seu noivado foi cancelado pouco antes do casamento. Ela terminou em bons termos com seu ex-noivo, mas desde então os feromônios de ômegas a deixam doente. Então, quando a queridinha nacional Ju Heeyoun aparece à sua porta pedindo apenas uma noite e dizendo que quer ter um filho dela, Cha Sia não consegue evitar ficar perplexa. Será que a noite que passaram juntas será o começo de algo incrível ou apenas um grande erro?<br><br>Nomes alternativos: One Night Only,아 이만 주세요 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | LINT | All 34 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=34 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://hotcabaretscan.com/.../000.png` to `https://hotcabaretscan.com/.../000.png` (1 redirects); popular: `http://hotcabaretscan.com/.../634d9b76639f8_external_cover.webp` to `https://hotcabaretscan.com/.../634d9b76639f8_external_cover.webp` (1 redirects) |  |  |  |
| page load | PASS | `http://hotcabaretscan.com/.../000.png` (image/png, 569832 bytes, 736x500) |  |  |  |
