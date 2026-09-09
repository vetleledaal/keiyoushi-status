# Extension Validation Report

- Extension: tachiyomi-es.platinumlilyscan-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5939158356306781713
- Source name: Platinum Lily Scan
- Source language: es
- Selected manga input: latest offset 0: Machiawase wa Asayake no Shita de (`.../machiawase-wa-asayake-no-shita-de`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 73 | Kimi ga Shinu made Koi wo shitai (`.../kimi-ga-shinu-made`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 73 | Machiawase wa Asayake no Shita de (`.../machiawase-wa-asayake-no-shita-de`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Machiawase wa Asayake no Shita de (`.../machiawase-wa-asayake-no-shita-de`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Machiawase wa Asayake no Shita de (`.../machiawase-wa-asayake-no-shita-de`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 2 | Capítulo 1 - Esperando bajo el resplandor del mañana (`.../machiawase-wa-asayake-no-shita-de`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 73 entries |  |  |  |
| latest listing | PASS | 73 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Machiawase wa Asayake no Shita de, URL=`machiawase-wa-asayake-no-shita-de` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 147/147 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 147/147 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://platinumlilyscan.com/.../1783919626733-9vxpat.webp` (image/webp (encoding: lossy), 193330 bytes, 1456x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `machiawase-wa-asayake-no-shita-de` |  |  |  |
| details thumbnail URL | PASS | `https://platinumlilyscan.com/.../1783919626733-9vxpat.webp` |  |  |  |
| details author | PASS | Toumei-Iro |  |  |  |
| details artist | PASS | goma_feet |  |  |  |
| details genres | PASS | Yuri, Romance, Drama, Slice of Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tras los acontecimientos de Uma Musume: Road to the Top, Narita Top Road y Admire Vega vuelven a encontrarse antes del amanecer. Un doujinshi de romance y slice of life que retrata con delicadeza los sentimientos compartidos entre ambas mientras disfrutan de un tranquilo momento bajo el cielo matutino. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://platinumlilyscan.com/.../001.webp` (image/webp (encoding: lossy), 193330 bytes, 1456x2048) |  |  |  |
