# Extension Validation Report

- Extension: tachiyomi-ja.sundaywebevery-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 8083066303045184316
- Source name: Sunday Web Every
- Source language: ja
- Selected manga input: latest offset 0: 閃道トキの５分間 (`.../12207421983738300325`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 283 | 初恋あるごりずむ (`.../12207421984125927743`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 9 | 閃道トキの５分間 (`.../12207421983738300325`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 閃道トキの５分間 (`.../12207421983738300325`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 閃道トキの５分間 (`.../12207421983738300325`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | 第1話 クレープ (`.../12207421983738300325`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 283 entries |  |  |  |
| latest listing | PASS | 9 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=閃道トキの５分間, URL=`.../12207421983738300325` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 293/293 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 293/293 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.www.sunday-webry.com%2Fpublic%2Fseries-sub-thumbnail-vertical-with-logo%2F12207421983738251456-b5ea5a828f54adb6b19cda039b8efe78%3F1779268497` (image/jpeg, 66946 bytes, 504x354) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421983738300325` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.www.sunday-webry.com%2Fpublic%2Fseries-thumbnail%2F12207421983738251456-dfbc4344091e33c070b81bbe482d66f5%3F1779268483` (image/jpeg, 57594 bytes, 484x281) |  |  |  |
| details author | PASS | 葉山 羊 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 閃道トキ、１５歳。 能力：時間停止 日々、街を守る大人気ヒーロー・閃道トキを知らない人間はいない。 一歩動けば、カメラと歓声。無数の”目”がついてくる。 誰にも知られる彼女の青春は、「止まった世界」の中だけに存在している。 全ての人・モノが止まった世界で、一瞬だけの奔放な時間を過ごすトキ。 そのことはまだ、彼女だけのヒミツ。 のハズだった。 “一時停止”の世界を楽しんじゃおう！ 最強ヒーロー少女が謳歌する、一瞬青春ラブコメディー！！ ◆作者コメント 初連載です！ラブコメです！ よろしくお願いいたします！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.www.sunday-webry.com/.../12207421983746508820-dde89d692df7947b5aa9bfe77bc86bdc` (image/jpeg, 503559 bytes, 1303x2048) |  |  |  |
