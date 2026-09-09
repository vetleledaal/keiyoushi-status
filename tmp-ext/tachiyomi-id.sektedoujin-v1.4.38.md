# Extension Validation Report

- Extension: tachiyomi-id.sektedoujin-v1.4.38
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
- Source ID: 7949854430526190429
- Source name: Sekte Doujin
- Source language: id
- Selected manga input: latest offset 0: My Girlfriend Was Already Fully Trained (`.../my-girlfriend-was-already-fully-trained`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Got a Room? (Uncensored) (`.../got-a-room-uncensored`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | My Girlfriend Was Already Fully Trained (`.../my-girlfriend-was-already-fully-trained`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Soeun (`.../soeun`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | My Girlfriend Was Already Fully Trained (`.../my-girlfriend-was-already-fully-trained`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | My Girlfriend Was Already Fully Trained (`.../my-girlfriend-was-already-fully-trained`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 39 | Chapter 01 (`.../my-girlfriend-was-already-fully-trained-chapter-01`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Girlfriend Was Already Fully Trained, URL=`.../my-girlfriend-was-already-fully-trained` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../My-Girlfriend-Was-Already-Fully-Trained.jpg <redacted query values: resize>` (image/jpeg, 16151 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-girlfriend-was-already-fully-trained` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../My-Girlfriend-Was-Already-Fully-Trained.jpg` (image/jpeg, 54748 bytes, 342x480) |  |  |  |
| details author | PASS | Gongshim |  |  |  |
| details artist | PASS | Gongshim |  |  |  |
| details genres | PASS | Adult, Drama, Mature, Seinen, Smut, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Seharusnya aku tidak memeriksa ponsel pacarku hari itu.” Aku mendengar desas-desus aneh tentang pacarku, Hayoung, dari seorang teman. “Aku melihat Hayoung keluar dari motel… dengan pria lain.” Aku mengabaikan apa yang mereka katakan, berpikir mereka pasti salah lihat. Namun, sebagian diriku curiga padanya. Dan untuk pertama kalinya, aku memeriksa ponsel pacarku… “Apa yang kau lakukan? Lepaskan pakaianmu. Lepaskan bra dan celana dalammu.”<br><br>Alternative Names: 내 여자친구는 이미 조교완료 되었다, 我的女友已经被调教完成了, 俺は知らない彼女の顔, My Girlfriend Has Already Completed the Assistant Training, My Girlfriend Is Already Trained, My Girlfriend Has Already Done Teaching |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 39 chapters |  |  |  |
| chapter dates | PASS | 39 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.uqni.net/.../00.jpg` (image/jpeg, 447422 bytes, 720x1080) |  |  |  |
