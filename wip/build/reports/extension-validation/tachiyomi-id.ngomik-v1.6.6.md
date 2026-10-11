# Extension Validation Report

- Extension: tachiyomi-id.ngomik-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: mangathemesia
- Source ID: 5360960267485387879
- Source name: Ngomik (unoriginal)
- Source language: id
- Selected manga input: popular offset 0: Magic Emperor (`.../magic-emperor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 22 | The Return of the Disaster-Class Hero (`.../the-return-of-the-disaster-class-hero`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 22 | The World’s Best Kunlun Tavern (`.../the-worlds-best-kunlun-tavern`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | The Regressed Son Of A Duke Is An Assassin (`.../the-regressed-son-of-a-duke-is-an-assassin`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 927 | Chapter 1 (`.../magic-emperor-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 66 |  |  | 1-10s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magic Emperor, URL=`.../magic-emperor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.bid-cdn.cloud/.../tenor.gif` (image/gif (format: 89a), 432520 bytes, 220x372) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../magic-emperor` |  |  |  |
| details thumbnail URL | PASS | `https://cover.bid-cdn.cloud/.../tenor.gif` |  |  |  |
| details author | PASS | Wuer Manhua, Ye Xiao |  |  |  |
| details artist | PASS | Wuer Manhua |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Martial arts, Shounen, Supernatural, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Zhuo Yi Fan dijuluki Kaisar Iblis karena dia menjadi yang terkuat dengan menggunakan Kitab Sembilan Rahasia Raja Iblis Kuno. Diincar oleh semua ahli Tanah Suci dan bahkan dikhianati oleh muridnya sendiri karena keserakahan akan kekuatannya, dia pun mati. Kemudian jiwanya masuk dan hidup kembali dalam diri seorang anak laki-laki pelayan keluarga bernama Zhuo Fan. Dibatasi oleh perasaan tubuh, dia tidak bisa mengabaikan keluarga dan nyonya yang dia layani. Menyatukan ingatan sang anak dengan ingatan di kehidupan sebelumnya, dia sekarang akan memimpin keluarga yang sedang merosot ini kembali ke puncak benua ini dan merebut kembali kursinya di puncak!<br><br>Alternative Names: <br>- Demon Magic Emperor<br>- Demonic Emperor<br>- Housekeeper Is the Magic Emperor<br>- Magic Emperor<br>- Mo Huang Da Guan Jia<br>- The Servant Is the Demon King?!<br>- The Steward Demonic Emperor<br>- امپراطور جادو<br>- 魔皇大管家<br>- 마황의 귀환 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 927 chapters |  |  |  |
| chapter dates | PASS | 927 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://srvr1.bid-cdn.cloud/.../001.webp` (image/webp (encoding: lossy), 87812 bytes, 620x735) |  |  |  |
