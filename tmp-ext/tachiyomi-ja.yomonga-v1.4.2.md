# Extension Validation Report

- Extension: tachiyomi-ja.yomonga-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7561635982432447429
- Source name: Yomonga
- Source language: ja
- Selected manga input: popular offset 0: 黒の世界は白墨に染まる (`.../2558 <redacted query values: episode and cid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 黒の世界は白墨に染まる (`.../2558 <redacted query values: episode and cid>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | 「ただの空気」が吸えなくなりました。 ～化学物質過敏症で無職になった話～ (`.../2112 <redacted query values: episode and cid>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 黒の世界は白墨に染まる (`.../2558 <redacted query values: episode and cid>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 黒の世界は白墨に染まる (`.../2558 <redacted query values: episode and cid>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | Chapter.1　第1話_1 (`.../2558 <redacted query values: episode and cid>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=黒の世界は白墨に染まる, URL=`.../2558 <redacted query values: episode and cid>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.yomonga.com/.../%E6%9B%B8%E5%BD%B1%E3%82%B5%E3%83%A0%E3%83%8D%E3%82%A4%E3%83%AB_%E6%96%B0%E5%88%8A_%E9%BB%92%E3%81%AE%E4%B8%96%E7%95%8C%E3%81%AF%E7%99%BD%E5%A2%A8%E3%81%AB%E6%9F%93%E3%81%BE%E3%82%8B.png <redacted query values: v>` (image/png, 1113862 bytes, 640x908) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2558 <redacted query values: episode and cid>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.yomonga.com/.../%E6%9B%B8%E5%BD%B1%E3%82%B5%E3%83%A0%E3%83%8D%E3%82%A4%E3%83%AB_%E6%96%B0%E5%88%8A_%E9%BB%92%E3%81%AE%E4%B8%96%E7%95%8C%E3%81%AF%E7%99%BD%E5%A2%A8%E3%81%AB%E6%9F%93%E3%81%BE%E3%82%8B.png` (image/png, 1113862 bytes, 640x908) |  |  |  |
| details author | PASS | 涼海来夏 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 連載中, 女性向け, 男性向け, 美少女 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 顔に傷を負ったことが原因で周りから敬遠され心を閉ざしてしまった蛇乃目三白。唯一の心の支えは絵を描くことだけだったが、高校の先輩・猫宮黒絵との出逢いをきっかけに、その日常が少しずつ変わり始める。やがて黒板アートを通してふたりの間にはかけがえのない友情と絆が芽生え…。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.yomonga.com/.../ed9oBfl3.jpg` (image/jpeg, 1416907 bytes, 1622x2307) |  |  |  |
