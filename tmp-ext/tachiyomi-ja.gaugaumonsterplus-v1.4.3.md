# Extension Validation Report

- Extension: tachiyomi-ja.gaugaumonsterplus-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
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
- Selected manga input: popular offset 0: 寝取られ追放された最強騎士団長のおっさん、片田舎で英雄に祭り上げられる (`.../64e86738a53aef0a8a000003`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | 寝取られ追放された最強騎士団長のおっさん、片田舎で英雄に祭り上げられる (`.../64e86738a53aef0a8a000003`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 小金井兄妹の休息 (`.../YcguPZdW5nSHOkxjjJ6dbBK6f`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 寝取られ追放された最強騎士団長のおっさん、片田舎で英雄に祭り上げられる (`.../64e86738a53aef0a8a000003`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 寝取られ追放された最強騎士団長のおっさん、片田舎で英雄に祭り上げられる (`.../64e86738a53aef0a8a000003`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | 第1話 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=寝取られ追放された最強騎士団長のおっさん、片田舎で英雄に祭り上げられる, URL=`.../64e86738a53aef0a8a000003` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gaugau.futabanet.jp/.../85b3e3ac-9e83-4050-823b-4788046b6fe1.jpg` (image/jpeg, 36717 bytes, 259x259) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../64e86738a53aef0a8a000003` |  |  |  |
| details thumbnail URL | PASS | `https://gaugau.futabanet.jp/.../85b3e3ac-9e83-4050-823b-4788046b6fe1.jpg` |  |  |  |
| details author | PASS | 炭基研&海星, 時光,吉原基貴, ずおさん, れんた |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 田舎, ファンタジー, 戦争, 婚約破棄, 最強, 双子, 社畜, 成り上がり, 異世界, スローライフ, 寝取られ, おっさん, アラサー, 魔法, 獣人, バトル, なろう, 少年向け, 青年向け, ライトノベル, アクション, 異世界転生, 美少女, 美人, チート, メディアミックス, 田舎, ファンタジー, 戦争, 婚約破棄, 最強, 双子, 社畜, 成り上がり, 異世界, スローライフ, 寝取られ, おっさん, アラサー, 魔法, 獣人, バトル, なろう, 少年向け, 青年向け, ライトノベル, アクション, 異世界転生, 美少女, 美人, チート, メディアミックス, 転生・召喚, 少年向け, 青年向け, 大人向け, 少女向け |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 長年、王国の平和維持に貢献してきた騎士団長・ウォーレナ。 一年にわたる蛮族征伐から生還するも、婚約者である第三王女が浮気の上、妊娠。王家は身内の醜聞をもみ消すため、ウォーレナは征伐中に死亡したことにされてしまう。 失意の中、国に見切りをつけた彼は、賠償金を元手にのんびり田舎でスローライフをすることに。聖女や狐人族の少女などが次々と集まり、彼女たちから慕われ、やがて溺愛される。 けれど彼には彼女たちを愛せない理由があって……？国を追われた最強のおっさんの成り上がりファンタジー！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gaugau.futabanet.jp/.../M_H.jpg` (image/jpeg, 682840 bytes, 1126x1600) |  |  |  |
