# Extension Validation Report

- Extension: tachiyomi-pt.hentaidatia-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4905141450496874891
- Source name: Hentai da Tia
- Source language: pt-BR
- Selected manga input: popular offset 0: Yamashiro Ren (Fate/Grand Order) (`.../yamashiro-ren-portugues`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Yamashiro Ren (Fate/Grand Order) (`.../yamashiro-ren-portugues`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | Banho da Elfa Erótica 2 (`.../ero-elf-no-yu-2-portugues`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | Quero Ser Brincada pela Uzaki-chan! (Uzaki-chan wa Asobitai) (`.../uzaki-chan-ni-asobaretai-portugues`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Penti] Yamashiro Ren (Fate/Grand Order) (`.../yamashiro-ren-portugues`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Penti] Yamashiro Ren (Fate/Grand Order) (`.../yamashiro-ren-portugues`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../yamashiro-ren-portugues`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Penti\] Yamashiro Ren (Fate/Grand Order), URL=`.../yamashiro-ren-portugues` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaidatia.com/.../Yamashiro-Ren-pornhwa-xxx-1.webp` (image/webp (encoding: lossy), 424022 bytes, 2240x2880) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Yamashiro Ren (Fate/Grand Order) to \[Penti\] Yamashiro Ren (Fate/Grand Order) |  |  |  |
| details thumbnail URL | PASS | `https://hentaidatia.com/.../Yamashiro-Ren-pornhwa-xxx-1.webp` |  |  |  |
| details author | PASS | Penti |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doujinshi, Ahegao, Anal, BBC, Colorido, Controle da Mente, Destruição de Mente, Dominação, Paródia, Pau Grande, Peitos Grandes |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Paródia de Fate/Grand Order.<br><br>**Título original:** Yamashiro Ren · **Paródia:** Fate/Grand Order · **Tradutor:** Hentai da Tia |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaidatia.com/.../Yamashiro-Ren-pornhwa-xxx-1-scaled.webp` (image/webp (encoding: lossy), 359420 bytes, 1991x2560) |  |  |  |
