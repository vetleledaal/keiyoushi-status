# Extension Validation Report

- Extension: tachiyomi-en.ezmanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: ezmanhwa
- Source ID: 3317136566565343717
- Source name: EZmanga
- Source language: en
- Selected manga input: popular offset 0: For Your Murder (`.../for-your-murder`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | For Your Murder (`.../for-your-murder`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | I Carry The Enemy 's Child (`.../i-carry-the-enemy-'s-child`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Coldhearted Duke Is Obsessed With the Seal Princess (`.../the-coldhearted-duke-is-obsessed-with-the-seal-princess`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Turning Back Time, I Choose a New Life (`.../turning-back-time-i-choose-a-new-life`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | For Your Murder (`.../for-your-murder`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | For Your Murder (`.../for-your-murder`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 69 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=For Your Murder, URL=`for-your-murder` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.ezmanga.org/.../815a0267-e238-48ec-89bb-cad3ba7637ca.webp` (image/webp (encoding: lossy), 200866 bytes, 1060x1484) |  |  |  |
| details identity | PASS | Details preserved selected URL `for-your-murder` |  |  |  |
| details thumbnail URL | PASS | `https://media.ezmanga.org/.../815a0267-e238-48ec-89bb-cad3ba7637ca.webp` |  |  |  |
| details author | PASS | Seyoon |  |  |  |
| details artist | PASS | Naver |  |  |  |
| details genres | PASS | Thriller, Drama |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Elementary school teacher Giseong, who has always suppressed her true self, is tormented by demanding parents. Seeking legal help, she visits a nearby lawyer. However, the lawyer she turns to is Oh Inseop, who turns out to be a serial killer.<br><br>Alternative Titles: 당신의 살인을 위하여 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | PASS | 69 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.ezmanga.org/.../01.webp` (image/webp (encoding: lossy), 1528722 bytes, 800x14000) |  |  |  |
