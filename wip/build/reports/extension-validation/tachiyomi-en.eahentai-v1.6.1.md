# Extension Validation Report

- Extension: tachiyomi-en.eahentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6252565297586539202
- Source name: EAHentai
- Source language: en
- Selected manga input: popular offset 0: [Terasu MC] My beloved wife and daughter [Full Color] (`.../6571`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | [Terasu MC] My beloved wife and daughter [Full Color] (`.../6571`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 42 | [Tobe] Mother and I (Second Part) (Kimetsu no Yaiba) [Uncle Bane] [Colorized] (`.../26084`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 42 | [Minato Yuu] Onee-san to Shiyo? ~Echinpo Card de Yaritai Houdai~ (5) | Wanna Do It With Onee-san? ~The Ecchi Card: Do What You Want!~ (5)  [Rei Scans] (`.../78444`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 42 | [みみっく] （支援者向け）志貴君と3臨様のお話 (`.../78402`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Terasu MC] My beloved wife and daughter [Full Color] (`.../6571`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Terasu MC] My beloved wife and daughter [Full Color] (`.../6571`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../6571`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Terasu MC\] My beloved wife and daughter \[Full Color\], URL=`6571` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.eahentai.com/.../01t.jpg` (image/jpeg, 39895 bytes, 450x636; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `6571` |  |  |  |
| details thumbnail URL | PASS | `https://i.eahentai.com/.../01t.jpg` |  |  |  |
| details author | PASS | terasu mc |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Lolicon, Colored, Doujinshi, group, lolicon, stockings, bondage, incest, milf, swimsuit, ffm threesome, femdom, netorare, cheating, bikini, ponytail, mother, gag, handjob, blindfold, beauty mark, daughter, chastity belt, onahole, brown hair |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A deceptive family portrait transforms into an intense session of pleasure and control. What begins as a pleasant day out quickly shifts as a mother and daughter take charge of their husband and father. Bound by a gag and blindfold, he is subjected to the relentless stimulation of a specialized onahole, surrendered to their whims. As they tease and dominate him, the tension rises between his struggle to maintain control and their playful, commanding nature, forcing him to face the ultimate test of his endurance.<br><br>**Parodies:** original |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.eahentai.com/.../01.jpg` (image/jpeg, 212902 bytes, 1200x1697; server Content-Type: application/octet-stream) |  |  |  |
