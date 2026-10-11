# Extension Validation Report

- Extension: tachiyomi-id.lumoskomik-v1.6.57
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: hwalumi
- Source ID: 2530259860313477889
- Source name: LumosKomik
- Source language: id
- Selected manga input: popular offset 0: All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Return of the Sword God-Rank Civil Servant (`.../return-of-the-sword-god-rank-civil-servant`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Yahari Ore no Seishun Love Come wa Machigatteiru @comic (`.../yahari-ore-no-seishun-love-come-wa-machigatteiru-comic`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Xianwu Dizun (`.../xianwu-dizun`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 99 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 199 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=All My Alter Egos Are Tycoons, URL=`all-my-alter-egos-are-tycoons` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Martial Peak, URL=`honeypot-trap-xz9k2` at page 1 offset 24 and page 2 offset 24 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Beginning After the End, URL=`honeypot-trap-xz9k2` at page 1 offset 24 and page 2 offset 24 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lms.imgsvr.my.id/.../likcWR8S_6bX.webp` (image/webp (encoding: lossy), 139348 bytes, 600x840) |  |  |  |
| details identity | PASS | Details preserved selected URL `all-my-alter-egos-are-tycoons` |  |  |  |
| details thumbnail URL | PASS | `https://lms.imgsvr.my.id/.../likcWR8S_6bX.webp` |  |  |  |
| details author | PASS | LICO |  |  |  |
| details artist | PASS | 한사 |  |  |  |
| details genres | PASS | Action, Fantasy, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Pria muda, Han Sunghyun, kehilangan keluarganya dalam serangan superhuman tanpa pandang bulu. Selagi hidup menyendiri karena trauma, suatu hari, dia membangkitkan kemampuan untuk mengendalikan avatar di tempatnya! “Apa?! Aku bisa mengirim avatar berburu ke dunia lain yang berbahaya selagi aku santai-santai di rumah, hanya fokus memperkuat kekuatanku?!”<br>Bersama dengan tumbuh pesat avatarnya, menyebrangi dimensi, ras, dan profesi, Hang Sunghyun mulai memburu superhuman yang menyalahgunakan kekuatan mereka! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 99 chapters |  |  |  |
| chapter dates | LINT | All 99 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=99 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 199 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lms.imgsvr.my.id/.../001_q-KV4b.webp` (image/webp (encoding: lossy), 135812 bytes, 800x1000) |  |  |  |
