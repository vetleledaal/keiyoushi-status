# Extension Validation Report

- Extension: tachiyomi-all.lunaranime-v1.6.9
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 7328677245254276970
- Source name: Lunar Manga
- Source language: en
- Selected manga input: popular offset 0: The Remarried Empress (`.../the-remarried-empress-official`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | The Remarried Empress (`.../the-remarried-empress-official`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Cliterary Book Club (`.../cliterary-book-club`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | My Crush Got Possessed by the Duke (`.../my-crush-got-possessed-by-the-duke`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Dear My Flawless Duke (`.../dear-my-flawless-duke-off`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Remarried Empress (`.../the-remarried-empress-official`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Remarried Empress (`.../the-remarried-empress-official`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 254 | Chapter 1: Episode 1 (`.../1 <redacted query values: lang>`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Remarried Empress, URL=`.../the-remarried-empress-official` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://vault.lunarx.to/.../dfd23a62-feee-4989-be70-3c8c23c60b8a.jpg` (image/jpeg, 170515 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-remarried-empress-official` |  |  |  |
| details thumbnail URL | PASS | `https://vault.lunarx.to/.../dfd23a62-feee-4989-be70-3c8c23c60b8a.jpg` |  |  |  |
| details author | PASS | Alpha Tart , Herelee |  |  |  |
| details artist | PASS | Sumpul |  |  |  |
| details genres | PASS | Josei, Drama, Fantasy, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | PG-13 · 2019 · Webtoon<br><br>Navier Ellie Trovi was an empress perfect in every way -- intelligent, courageous, and socially adept. She was kind to her subjects and devoted to her husband. Navier was perfectly content to live the rest of her days as the wise empress of the Eastern Empire. That is, until her husband brought home a mistress and demanded a divorce. “I accept this divorce… And I request an approval of my remarriage.” In a shocking twist, Navier remarries another emperor and retains her title and childhood dream as empress. But just how did everything unfold?<br><br>**Alternative Names:**<br>- Die neuvermählte Kaiserin<br>- Hoàng hậu tái hôn<br>- Jaehon Hwanghu<br>- L'impératrice remariée<br>- La emperatriz de volvio a casar<br>- La emperatriz divorciada<br>- Remarried Empress<br>- Second marriage of the Empress<br>- The Second Marriage<br>- The Second Marriage of the Empress<br>- Tái hôn Hoàng hậu<br>- Второй брак императрицы<br>- Императрица вновь выходит замуж<br>- Императрица снова выходит замуж<br>- Повторное замужество императрицы<br>- การแต่งงานครั้งใหม่ของจักรพรรดินี<br>- 再婚承認を要求します<br>- 再婚皇后<br>- 재혼 황후<br>- 재혼황후 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 254 chapters |  |  |  |
| chapter dates | PASS | 254 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Captcha needs interaction, but the app isn't in the foreground |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
