# Extension Validation Report

- Extension: tachiyomi-pt.borutoexplorer-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2962682340286299668
- Source name: Boruto Explorer
- Source language: pt-BR
- Selected manga input: popular offset 0: Boruto: Naruto Next Generations (`.../23`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Boruto: Naruto Next Generations (`.../23`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Naruto: Versão Colorida Oficial (`.../569`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Boruto: Naruto Next Generations (`.../23`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boruto: Naruto Next Generations (`.../23`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 80 | Capítulo 1 - Boruto Uzumaki!! (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 59 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Boruto: Naruto Next Generations, URL=`23` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leitor.borutoexplorer.com.br/.../boruto-20-panini-brasil-350x476.webp` (image/webp (encoding: lossy), 47494 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `23` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://leitor.borutoexplorer.com.br/.../boruto-20-panini-brasil.webp` (image/webp (encoding: lossy), 137540 bytes, 897x1313) |  |  |  |
| details author | PASS | Masashi Kishimoto, Ukyō Kodachi |  |  |  |
| details artist | PASS | Ikemoto Mikio |  |  |  |
| details genres | PASS | Shōnen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Continuação direta de Naruto. O mangá terá foco no filho de Naruto e Hinata, Boruto, e Sarada, a filha de Sasuke e Sakura e na nova geração de ninjas após a 4° Grande Guerra Ninja.<br><br>Nomes alternativos: BORUTO-ボルト- -NARUTO NEXT GENERATIONS |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 59 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://leitor.borutoexplorer.com.br/.../01.jpg` (image/jpeg, 726465 bytes, 1280x1100) |  |  |  |
