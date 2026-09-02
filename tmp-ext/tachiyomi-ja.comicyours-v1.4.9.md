# Extension Validation Report

- Extension: tachiyomi-ja.comicyours-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 2
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6785510785647577495
- Source name: Comic Y-OURs
- Source language: ja
- Selected manga input: popular offset 0: HELLSING (`.../2551460909792579818`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | HELLSING (`.../2551460909792579818`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 25 | 悪役令嬢転生おじさん (`.../12207421984006175413`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | HELLSING (`.../2551460909792579602`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | HELLSING (`.../2551460909792579818`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 35 | 第1話 (`.../2551460909792579602`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=HELLSING, URL=`.../2551460909792579602` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-y-ours.com%2Fpublic%2Fseries-thumbnail%2F2551460909770028948-3cf70e23b1f158b324806b511a177d77%3F1787049736` -> 2 manga URLs (examples: `.../2551460909788152203`, `.../12207421983946569669`), `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-y-ours.com%2Fpublic%2Fseries-thumbnail%2F2551460909766306479-5f6e271abbbfe2e420afbdec9eca9827%3F1763637687` -> 2 manga URLs (examples: `.../12207421984006177163`, `.../2551460909766550165`) |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-y-ours.com%2Fpublic%2Fseries-sub-thumbnail-horizontal-with-logo%2F2551460909770028970-bf9989f52bc50b26bbc608edee294e9e%3F1764826415` (image/jpeg, 453619 bytes, 2640x1160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2551460909792579818` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-y-ours.com%2Fpublic%2Fseries-thumbnail%2F2551460909770028970-aed162590e12e29ffbc297b790fc6409%3F1787049736` (image/jpeg, 95648 bytes, 484x484) |  |  |  |
| details author | PASS | 平野耕太 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 舞台は英国。吸血鬼による暴虐な事件が横行していた。そこで結成されたのが、反キリストのバケモノを狩る機関 王立国教騎士団 通称「HELLSING機関」。その一員である主人公アーカードは吸血鬼討伐のエキスパート。彼自身も吸血鬼であり、銃で撃たれようと、首をもがれようとその肉体は不死身。事件に巻き込まれ吸血鬼の体となってしまったセラス・ヴィクトリアも機関に加わり、団長 インテグラの指揮のもと、今日も吸血鬼事件の鎮圧に向かう。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.comic-y-ours.com/.../2551460909807229133-81d361684d404d622d2de985ee879a74` (image/jpeg, 264037 bytes, 856x1200) |  |  |  |
