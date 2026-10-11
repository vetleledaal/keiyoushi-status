# Extension Validation Report

- Extension: tachiyomi-pt.mangalivreblog-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 588678420372440028
- Source name: Manga Livre Blog
- Source language: pt-BR
- Selected manga input: popular offset 0: Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Pick Me Up! (`.../pick-me-up`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | O Psicopata do Murim (`.../o-psicopata-do-murim`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 21 | The Beginning After The End (`.../the-beginning-after-the-end`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Capítulo 1: Capítulo 1.1 (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu-capitulo-1-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu, URL=`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://livre.xn--c5wx58dnej.online/.../cover-001-e6ac9fc235.jpg` (image/jpeg, 41306 bytes, 252x356) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu` |  |  |  |
| details thumbnail URL | PASS | `https://livre.xn--c5wx58dnej.online/.../cover-001-e6ac9fc235.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Um menino chamado Ruisha está preso em um espaço distorcido criado pelo antigo herói. O que ele encontra lá é o Rei Demônio e o Rei Dragão, que deveria ter sido derrotado pelo herói há 300 anos. Ruisha faz amizade com o Rei Demônio e o Rei Dragão, e é treinado por eles |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangalivre.blog/.../1 <redacted query values: ordem>` to `https://mangalivre.blog/.../manga <redacted query values: ordem>` (1 redirects) |  |  |  |
| page load | PASS | `https://livre.xn--c5wx58dnej.online/.../page-001-9e06c1bd1090.webp` (image/webp (encoding: lossy), 315828 bytes, 2880x1600) |  |  |  |
