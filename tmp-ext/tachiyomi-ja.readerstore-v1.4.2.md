# Extension Validation Report

- Extension: tachiyomi-ja.readerstore-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 424606783143704524
- Source name: Reader Store
- Source language: ja
- Selected manga input: latest offset 0: 貧乏家族に牛丼奢ったら、おっぱいハーレムできちゃいました…。 (`.../11499881`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 劣等眼の転生魔術師 ～虐げられた元勇者は未来の世界を余裕で生き抜く～ (`.../10406458`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | スーパーの裏でヤニ吸うふたり (`.../10726034`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | 貧乏家族に牛丼奢ったら、おっぱいハーレムできちゃいました…。 (`.../11499881`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | 君が笑った【話読み】 (`.../11244710`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 貧乏家族に牛丼奢ったら、おっぱいハーレムできちゃいました…。 (`.../11499881`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 貧乏家族に牛丼奢ったら、おっぱいハーレムできちゃいました…。 (`.../11499881`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | 貧乏家族に牛丼奢ったら、おっぱいハーレムできちゃいました…。 ～美人12姉妹のHな恩返し～ （1） (`.../LT000250827004567554`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=貧乏家族に牛丼奢ったら、おっぱいハーレムできちゃいました…。, URL=`11499881` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ebookstore.sony.jp/.../LT000253448004679222_XLARGE.jpg` (image/jpeg, 38646 bytes, 281x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `11499881` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ebookstore.sony.jp/.../LT000250827004567554_XLARGE.jpg` (image/jpeg, 31836 bytes, 281x500) |  |  |  |
| details author | PASS | 桃尻レイ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | アダルト, アダルトコミック |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 大学の友達・班田は、とてもいいやつだが、とにかく貧乏だった。 ある日、危ないバイトに手を出そうとしていた彼を止め、牛丼を奢ることに。 しかし班田は一口だけ食べると、「残りは家族に持って帰る」と言い出す。 友達のためならと、家族全員分の牛丼まで奢ることにした俺。 ところが、班田の口から飛び出したのは「家族は12人いる」という衝撃の事実だった。 お礼に家へ招かれた俺を待っていたのは―― なんと12人の美人姉妹。 家へ帰ろうとしたその時、長女・子々（ねね）が突然訪ねてきて――。 本編33P収録！ 【注意事項】 ※本作品のシチュエーションは全てフィクションです。登場する人物や設定等は、すべて架空のものとなります。 ※この作品内に登場するキャラクターは全員20歳以上です。 ※本作品はAIによる生成画像を使用して制作しております。 ※犯罪、その他違法行為を美化または助長する意図はございません。<br><br>Label: ぽろっと天狗(R)<br><br>Publisher: ラビットフット<br><br>Rating: 18+ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | LINT | All 9 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=9 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.ebookstore.sony.jp/.../image_url <redacted query values: indices, code, and accept>` (image/webp (encoding: lossy), 203014 bytes, 720x1280) |  |  |  |
