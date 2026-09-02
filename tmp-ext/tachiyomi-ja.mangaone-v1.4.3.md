# Extension Validation Report

- Extension: tachiyomi-ja.mangaone-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7948822981386785924
- Source name: Manga One
- Source language: ja
- Selected manga input: popular offset 0: 獣王と薬草 (`.../2379`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 294 | 獣王と薬草 (`.../2379`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | 獣王と薬草 (`.../2379`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 獣王と薬草 (`.../2379`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 獣王と薬草 (`.../2379`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 115 | 第1話 - 人と魔族の物語 (`.../214131`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 71 |  |  | <1s |

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
| popular listing | PASS | 294 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=獣王と薬草, URL=`2379` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 310/310 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 310/310 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://app.manga-one.com/.../8800.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 79120 bytes, 640x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `2379` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 艮田竜和,坂野旭,ももちち |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ダンジョンには夢があるーー 倒したモンスターの素材を剥ぎ取り、 未開拓エリアに到達してお宝を手にいれる！ そんな成り上がりを夢見る冒険者のティナは ダンジョンの探索中、重傷を負ってしまう。 彼女の前に現れたのは、かつて勇者に 殺されたはずの最強の魔族「獣王・ガロン」で―!? 『銀狼ブラッドボーン』原作の艮田竜和が描く ダンジョンファンタジー×医療ドラマ、開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 71 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://app.manga-one.com/.../1.webp.enc <redacted query values: hash and expires>` (image/webp (encoding: lossy), 56016 bytes, 720x1020; server Content-Type: application/octet-stream) |  |  |  |
