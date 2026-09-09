# Extension Validation Report

- Extension: tachiyomi-en.lagoonscans-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7925933833035450162
- Source name: Lagoon Scans
- Source language: en
- Selected manga input: latest offset 0: The Former Supreme (`.../the-former-supreme`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | The Regressed Mercenary’s Machinations (`.../the-regressed-mercenarys-machinations`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Former Supreme (`.../the-former-supreme`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Supercritical Hell (`.../supercritical-hell`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Former Supreme (`.../the-former-supreme`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Former Supreme (`.../the-former-supreme`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 15 | Chapter 1 (`.../the-former-supreme-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Former Supreme, URL=`.../the-former-supreme` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../078234a8-cce4-44f3-8aa5-87d4bec37f3d.webp <redacted query values: resize>` (image/jpeg, 43800 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-former-supreme` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../078234a8-cce4-44f3-8aa5-87d4bec37f3d.webp` (image/jpeg, 327749 bytes, 1042x1510) |  |  |  |
| details author | PASS | Jang Yeonghun, KHJ |  |  |  |
| details artist | PASS | Son Min |  |  |  |
| details genres | PASS | Action, Historical, Martial arts, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Baek Socheon, once the unrivaled master of the Jianghu, has been reduced to a mere administrative post in name only. Though he has lost both his martial arts and his honor, his spirit remains unbroken… Starting once more from rock bottom, the former supreme sets out to reclaim the power he lost and the time he left behind. Thus begins the second martial legend of the man who was once the strongest.<br><br>Alternative Names: Supreme Job Change, The Former Absolute Supreme, The Former Supreme, 轉職至尊, 전직지존 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lagoonscans.com/.../01-134.webp` (image/webp (encoding: lossy), 454766 bytes, 800x12850) |  |  |  |
