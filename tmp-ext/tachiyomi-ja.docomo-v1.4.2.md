# Extension Validation Report

- Extension: tachiyomi-ja.docomo-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2833994049092509182
- Source name: Docomo
- Source language: ja
- Selected manga input: popular offset 0: 【電子版限定特典付き】ブチ切れ令嬢は報復を誓いました。12～魔導書の力で祖国を叩き潰します～ (`.../2000`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 【電子版限定特典付き】ブチ切れ令嬢は報復を誓いました。12～魔導書の力で祖国を叩き潰します～ (`.../2000`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | 【分冊版】誰かこの状況を説明してください！ ～契約から始まるウェディング～ 第83話(アリアンローズコミックス) (`.../2000`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ブチ切れ令嬢は報復を誓いました。 (`.../2000`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 【電子版限定特典付き】ブチ切れ令嬢は報復を誓いました。12～魔導書の力で祖国を叩き潰します～ (`.../2000`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | 【電子版限定特典付き】ブチ切れ令嬢は報復を誓いました。1～魔導書の力で祖国を叩き潰します～ (`.../view <redacted query values: cid, cti, and cc>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 181 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 1 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mw-cds.akamaized.net/.../cover.jpg <redacted query values: ivm>` (image/jpeg, 18231 bytes, 180x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2000` |  |  |  |
| details thumbnail URL | PASS | `https://mw-cds.akamaized.net/.../cover.jpg <redacted query values: ivm>` |  |  |  |
| details author | PASS | はぐれメタボ, おおのいも |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性マンガ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ハルドリア王国の王太子（ルビ：フリード）から一方的に婚約破棄され、王太子妃候補として尽くしてきた国からも見捨てられた公爵令嬢・エリザベートは、祖国への復讐を固く誓う。そして亡命先の帝国でエリー・レイスと名を変えると、その才覚を武器に商人として瞬く間に成り上がっていく。さらなる商売拡大のため、銀蝶ヒルデ・カラードが牛耳る帝国最大の歓楽街ケレバンへとやってきたエリー率いるトレートル商会一行。しかし、同行した不良シスター・ティーダが街の酒場で聞き込んだところ、どうやらここでもイブリス教が不穏な動きをしているようで――!?壮大な大逆転ざまぁ劇、第12弾!!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | LINT | All 12 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=12 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 181 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://d21agqkwgk4jud.cloudfront.net/.../10db22f68dee3d741e.jpeg` (image/jpeg, 723237 bytes, 1351x1920) |  |  |  |
