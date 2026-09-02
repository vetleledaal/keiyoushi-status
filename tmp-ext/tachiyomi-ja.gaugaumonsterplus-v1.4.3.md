# Extension Validation Report

- Extension: tachiyomi-ja.gaugaumonsterplus-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9220365500598403749
- Source name: がうがうモンスター＋
- Source language: ja
- Selected manga input: popular offset 0: 婚約者が明日、結婚するそうです。 (`.../64fad985905bd46a9c000000`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | 婚約者が明日、結婚するそうです。 (`.../64fad985905bd46a9c000000`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 冒険には、武器が必要だ！～こだわりルディの鍛冶屋ぐらし～ (`.../5gPP1FR25ihHwVWoxVu6WapyP`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 婚約者が明日、結婚するそうです。 (`.../64fad985905bd46a9c000000`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 婚約者が明日、結婚するそうです。 (`.../64fad985905bd46a9c000000`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 6 | 第1話 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=婚約者が明日、結婚するそうです。, URL=`.../64fad985905bd46a9c000000` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gaugau.futabanet.jp/.../f1f67a5f-df47-4529-a6ed-afb62fe3062f.jpg` (image/jpeg, 41320 bytes, 259x259) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../64fad985905bd46a9c000000` |  |  |  |
| details thumbnail URL | PASS | `https://gaugau.futabanet.jp/.../f1f67a5f-df47-4529-a6ed-afb62fe3062f.jpg` |  |  |  |
| details author | PASS | 三毛たま, 炭基研／水母, 櫻井みこと（ツギクル）, カズアキ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, 田舎, 勇者, 少女, 女主人公, シリアス, ファンタジー, 溺愛, イケメン, 幼馴染, 婚約破棄, 結婚, 女性向け, ラブコメ, 魔王, 魔法, 胸キュン, 追放, 貴族, 断罪, ざまぁ, 虐げられ, 聖女, なろう, 恋愛, 田舎, 勇者, 少女, 女主人公, シリアス, ファンタジー, 溺愛, イケメン, 幼馴染, 婚約破棄, 結婚, 女性向け, ラブコメ, 魔王, 魔法, 胸キュン, 追放, 貴族, 断罪, ざまぁ, 虐げられ, 聖女, なろう, 転生・召喚, 少年向け, 青年向け, 大人向け, 少女向け |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 捨てられた主人公がつかむ溺愛！幸せに満ちたシンデレラストーリー！王都から遠く離れた小さな村に住むラネは、5年前に出て行った婚約者が聖女と結婚する、という話を聞く。もう諦めていたから、なんとも思わない。どうしてか彼は、幼馴染たちを式に招待したいと言っているらしい。王城からの招きを断るわけにはいかず、婚約者と聖女の結婚式に参列することになったラネ。暗い気持ちで出向いた王都である人と出会い、彼女の運命は大きく変わっていく。不幸の中にいたラネが、真実の愛を手に入れる、ハッピーエンドロマンス。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gaugau.futabanet.jp/.../M_H.jpg` (image/jpeg, 466815 bytes, 1126x1600) |  |  |  |
