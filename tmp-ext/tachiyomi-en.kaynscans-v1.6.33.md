# Extension Validation Report

- Extension: tachiyomi-en.kaynscans-v1.6.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source theme: vinetheme
- Source ID: 6622233282902198923
- Source name: Kayn Scans
- Source language: en
- Selected manga input: popular offset 0: I Was Mistaken As A Monstrous Genius Actor (`.../kayn-s-73`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | I Was Mistaken As A Monstrous Genius Actor (`.../kayn-s-73`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | To Hell with Being Heir, I'm going to Heal (`.../kayn-s-290`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | The Former Supreme (`.../kayn-s-334`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Genius Blacksmith’s Game (`.../kayn-s-153`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Was Mistaken As A Monstrous Genius Actor (`.../kayn-s-73`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Was Mistaken As A Monstrous Genius Actor (`.../kayn-s-73`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | Chapter 1 (`.../kayn-c-2453`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Was Mistaken As A Monstrous Genius Actor, URL=`kayn-s-73` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kaynscans.com/.../4b92f5372d053cd7775995fac0f9e2d7.png` (image/png, 977627 bytes, 800x1038) |  |  |  |
| details identity | PASS | Details preserved selected URL `kayn-s-73` |  |  |  |
| details thumbnail URL | PASS | `https://kaynscans.com/.../4b92f5372d053cd7775995fac0f9e2d7.png` |  |  |  |
| details author | PASS | Kayn Scans |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHWA, KOREAN, Adventure, Comedy, Drama, Fantasy, Seinen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kang Woo-jin is an ordinary nobody—until one day, he gains a strange ability. Whenever he reads a script or screenplay, he’s pulled into a mysterious dimension where he can relive the character’s experiences. When he ends up showcasing a performance born from that dimension, his acting is so overwhelming that it leads to a massive misunderstanding.<br><br>Rating: 10.0<br>Type: MANHWA<br>Origin: KOREAN<br><br>Alternative titles: <br>- 대뜸 착각당했다 괴물 천재배우로<br>- Acteur de génie par accident<br>- I Was Immediately Mistaken for a Monster Genius Actor<br>- Mistaken for a Genius Actor<br>- Tôi Bị Hiểu Lầm Là Diễn Viên Thiên Tài Quái Vật<br>- ฉันเนี่ยนะ นักแสดงขั้นเทพ<br>- 会社辞めた俺、怪物級の天才俳優だと勘違いされてるんだが<br>- 誤打誤撞成為怪物天才演員<br>- 误打误撞成了天才演员 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kaynscans.com/.../p0004.jpg` (image/webp (encoding: lossy), 476418 bytes, 800x8000; server Content-Type: image/jpeg) |  |  |  |
