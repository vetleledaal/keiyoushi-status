# Extension Validation Report

- Extension: tachiyomi-en.artlapsa-v1.6.29
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: keyoapp
- Source ID: 734404203508686053
- Source name: Art Lapsa
- Source language: en
- Selected manga input: popular offset 0: Unlimited Vault: The Magic They Borrowed Will Be Their Downfall (`.../0070c20a-6954-4c39-bfde-7df67deff2a7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Unlimited Vault: The Magic They Borrowed Will Be Their Downfall (`.../0070c20a-6954-4c39-bfde-7df67deff2a7`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | I Was Supposed to Be a Mob Noblewoman Before I Was Killed — Unexpectedly Engaged to a Mysterious Duke (`.../0c7f75b2-3c35-4d0f-8da6-6f0d2790cc5b`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | It Was Just a Fake Marriage. But He’s Falling for Me!? A Genius Enchanter’s Vacation in a Foreign Land (`.../819d60f5-544a-4b11-a5a7-be61e25226ee`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Mount Revenge — I’ll Watch Until You’re Ruined: The Betrayed Wife’s Revenge (`.../f910fbd8-48f0-477a-864a-37068fbb61a6`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Unlimited Vault: The Magic They Borrowed Will Be Their Downfall (`.../0070c20a-6954-4c39-bfde-7df67deff2a7`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Unlimited Vault: The Magic They Borrowed Will Be Their Downfall (`.../0070c20a-6954-4c39-bfde-7df67deff2a7`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 34 | Chapter 01 (`.../be097406-b2e6-473c-aa5f-d38f238aade5`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Unlimited Vault: The Magic They Borrowed Will Be Their Downfall, URL=`.../0070c20a-6954-4c39-bfde-7df67deff2a7` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.artlapsa.com/.../300x450.webp` (image/webp (encoding: lossy), 42028 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../0070c20a-6954-4c39-bfde-7df67deff2a7` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.artlapsa.com/.../600x900.webp` (image/webp (encoding: lossy), 122878 bytes, 600x900) |  |  |  |
| details author | PASS | Masakichi (II) |  |  |  |
| details artist | PASS | IIJIMA Shingou |  |  |  |
| details genres | PASS | Japanese, Fantasy, Adventure, Seinen, Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | If you can’t pay back the magic... prepare for ruin! Rent, a member of the rising star party Blade of the Skycleaver, has always supported his team from the shadows with his rare Gift, Magic Vault—an ability to loan out magic power to others. But when his level growth lags behind, the party cruelly kicks him out, tossing aside all his loyalty and effort. Enraged by the betrayal, Rent’s Gift evolves into Unlimited Magic Vault, unlocking new potential—and summoning a mysterious and adorable support fairy named MP. Now, guided by MP, Rent sets out on a magical debt collection rampage, reclaiming the power he lent out… with interest. Those who used him will soon learn: magic debt is no joke.<br><br>Alternative Titles:<br>- The magical power I lent is forcibly collected through \[revolving payments\] ~<br>- 貸した魔力は【リボ払い】で強制徴収～用済みとパーティー追放された俺は、可愛いサポート妖精と一緒に取り立てた魔力を運用して最強を目指す。～ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | PASS | 34 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.artlapsa.com/.../001.jpg` (image/jpeg, 1229060 bytes, 1123x1938) |  |  |  |
