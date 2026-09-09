# Extension Validation Report

- Extension: tachiyomi-ja.piccoma-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7159690625157327655
- Source name: Piccoma
- Source language: ja
- Selected manga input: latest offset 0: 不能公爵に嫁いだら、子供を守りたくなりました (`.../211482`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 転生コロシアム ～最弱スキルで最強の女たちを攻略して奴隷ハーレム作ります～ (`.../122698 <redacted query values: etype>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 不能公爵に嫁いだら、子供を守りたくなりました (`.../211482`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | ゴーストマスターは億万長者 (`.../153509`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 不能公爵に嫁いだら、子供を守りたくなりました (`.../211482`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 不能公爵に嫁いだら、子供を守りたくなりました (`.../211482`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 20 | 第1話 (`.../6659162`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 129 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=不能公爵に嫁いだら、子供を守りたくなりました, URL=`.../211482` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 111/111 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 111/111 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://piccoma.kakaocdn.net/.../cover_x3` (image/jpeg, 307925 bytes, 828x1170; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../211482` |  |  |  |
| details thumbnail URL | PASS | `https://piccoma.kakaocdn.net/.../cover_x3` |  |  |  |
| details author | PASS | SHERPA STUDIO, 江東しろ, ほたるいし。, 高燃費 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, SMARTOON, ファンタジー, 女性マンガ, フルカラー, オリジナル, シェルパスタジオ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 伯爵家の私生児エミリーは、虐げられながらも自分の居場所を確保するために必死に家族の言うことを聞いて生きてきた。しかしある日、まるで邪魔者を処分するかのように、エミリーは世間から恐れ慄かれている“不能公爵”の元へ強引に嫁がされることに。同時に実母の死の衝撃の真相を知ったエミリーは（もう誰かの言いなりにはならない。今度こそ自分の人生を歩むのよ──！）と決意し、いざ公爵邸に足を踏み入れると……そこには警戒心MAXの男の子レオンがいて!?　さらには“不能公爵”ルメイアからも「何もしなくていい」と冷たく言い放たれてしまう。しかし、レオンのことを知っていくうちに、かつてない温かい感情がだんだんと芽生えてくるのだった。そして、ルメイアの“不能”の噂の裏には、ある秘密が隠されていて……？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | LINT | All 20 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=20 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 129 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pcm.kakaocdn.net/.../i00001.jpg <redacted query values: credential, expires, and signature>` (image/jpeg, 199358 bytes, 720x1000) |  |  |  |
