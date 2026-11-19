# Extension Validation Report

- Extension: tachiyomi-tr.merlinmanga-v1.6.59
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
- Source theme: madara
- Source ID: 896733953724376427
- Source name: Merlin Manga
- Source language: tr
- Selected manga input: popular offset 0: The Remarried Empress (`.../3291`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Remarried Empress (`.../3291`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Kont’un Gizli Hizmetçisi (`.../3060`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | My Life as an Internet Novel (`.../3964`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Gölgelerdeki Hükümdar Olmak İstiyorum (`.../3928`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Remarried Empress (`.../3291`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Remarried Empress (`.../3291`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 248 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Remarried Empress, URL=`3291` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://merlinmanga.com/.../the-remarried-empress.jpg` (image/jpeg, 72427 bytes, 460x635) |  |  |  |
| details identity | PASS | Details preserved selected URL `3291` |  |  |  |
| details thumbnail URL | PASS | `https://merlinmanga.com/.../the-remarried-empress.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Navier Ellie Trovi was an empress perfect in every way — intelligent, courageous, and socially adept. She was kind to her subjects and devoted to her husband. Navier was perfectly content to live the rest of her days as the wise empress of the Eastern Empire. That is, until her husband brought home a mistress and demanded a divorce. “I accept this divorce… And I request an approval of my remarriage.” In a shocking twist, Navier remarries another emperor and retains her title and childhood dream as empress. But just how did everything unfold?<br><br>(Source: WEBTOON) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 248 chapters |  |  |  |
| chapter dates | PASS | 248 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.imgchest.com/.../60b06df927c3.webp` (image/webp (encoding: lossy), 65656 bytes, 952x496) |  |  |  |
