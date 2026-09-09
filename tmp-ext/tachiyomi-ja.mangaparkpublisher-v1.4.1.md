# Extension Validation Report

- Extension: tachiyomi-ja.mangaparkpublisher-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2905661176145448719
- Source name: Manga-Park
- Source language: ja
- Selected manga input: latest offset 0: 隙間ヶ刻の住人たち (`.../108556`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | 社交界の毒婦とよばれる私～素敵な辺境伯令息に腕を折られたので、責任とってもらいます～ (`.../82650`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 86 | 隙間ヶ刻の住人たち (`.../108556`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 隙間ヶ刻の住人たち (`.../108556`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 隙間ヶ刻の住人たち (`.../108556`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 7 | 🆓 第1話① (`.../819247`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 86 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=隙間ヶ刻の住人たち, URL=`.../108556` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 117/117 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 117/117 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-park.com/.../2\$nLrqqA0.jpg <redacted query values: d9xYwZbKnShQ4wif-yjOJhYPfIvc13QkVU-jTm7YsXo>` (image/jpeg, 45568 bytes, 750x351) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../108556` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manga-park.com/.../1\$iLrqqA0.jpg <redacted query values: cNDduL6iyYPig8n7N6q-Z5-YqlXjNofQ38ZRmgXsIIE>` (image/jpeg, 62405 bytes, 750x450) |  |  |  |
| details author | PASS | 式縞鳴 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女子向け, ギャグ・コメディ, Parkオリジナル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "貧乏生活ゆえ貰える仕事は何でもこなす駆け出しライターの遠野（とおの）25歳。格安ワケアリ物件で暮らす遠野にある日、念願の執筆依頼が…！？ 滅多にない真っ当なライターの仕事に大喜びの遠野だったが、この仕事にはひとつ「条件」があった。それは、泥沼スランプ真っ最中のド陰気な推理小説家・灯雷巡（ひらいめぐり）と二人で取り組むこと――！！不屈の零細ライターとネガティブ小説家のコンビが日常の「隙間」をネタにすべく駆け巡る！SNSでのご感想はぜひ「#スキマガ」で！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manga-park.com/.../2h\$pPqspw0.jpg.enc <redacted query values: xPOMqg2c54vEhqHc0zEBgJDX1dylJwWdE3b3bRIimKiAUx7_NxFO33uBwTBMzWvTYiKA8yNY>` (image/jpeg, 189786 bytes, 960x1378; server Content-Type: application/octet-stream) |  |  |  |
