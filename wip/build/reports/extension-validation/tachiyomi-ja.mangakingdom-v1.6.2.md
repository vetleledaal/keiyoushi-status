# Extension Validation Report

- Extension: tachiyomi-ja.mangakingdom-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 1
- Warnings: 2
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3806352284314527898
- Source name: Manga Kingdom
- Source language: ja
- Selected manga input: popular offset 0: 捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC (`.../225662`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC (`.../225662`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | 黒百合町の魔女 (`.../235655`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 100 | 清楚誠実に生きていたら婚約者に裏切られたので、やり直しの世界では悪役令嬢として生きます (`.../191578`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC (`.../225662`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC (`.../225662`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 第1巻 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.NullPointerException | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC, URL=`225662` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 302/302 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 302/302 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cf.image-cdn.k-manga.jp/.../b225662_3_200.jpg` (image/jpeg, 28757 bytes, 200x284) |  |  |  |
| details identity | PASS | Details preserved selected URL `225662` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cf.image-cdn.k-manga.jp/.../b225662_1_320.jpg` (image/jpeg, 50500 bytes, 320x455) |  |  |  |
| details author | PASS | 柑奈まち, カレヤタミエ, 駒田ハチ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女漫画, SF・ファンタジー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 『このライトノベルがすごい！２０２６』（宝島社刊）新作単行本・ノベルズ部門第2位／単行本・ノベルズ部門第15位小説家になろう年間第１位（２０２４年４月～１０月）２０２４年もっとも読まれた超人気作、待望のコミカライズ第１巻！「私だって――勝手に幸せになってやる」運命に泣き寝入りなどするものか。したたか夫人の領地改革ヒューマン・ファンタジー！描き下ろし漫画＆原作・カレヤタミエ先生による書き下ろし小説豪華W収録！「君を愛するつもりはない」結婚式直後、夫になったばかりのアレクシスから冷たく言い渡された公爵夫人・メルフィーナ。彼女には前世の記憶があり、ここが乙女ゲームの世界であることを知っていた。この先、悪役令嬢として破滅する未来が待ち受けていることも。――理不尽な運命に泣き寝入りなどするものか。「私だって、勝手に幸せになってやる！」交渉の末、北方の僻地・エンカ―地方を手に入れると、新たな領主として【領地改革】を開始する。未開の土地。厳しい封建制の現実。迫りくる飢饉……。様々な困難に直面しながらも、次々と新たな挑戦を繰り出すメルフィーナのひたむきな姿は、やがて周囲の人々の心に温かな光を灯していき――。運命に抗い、この手で未来を変えていく。したたか夫人の領地改革ヒューマン・ファンタジー、開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | All 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | pages operation did not complete successfully |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://comic.k-manga.jp/.../0` to `https://comic.k-manga.jp/.../viewer.html <redacted query values: p0, p1, p2, p3, p4, p5, p8, p9, p10, p15, p16, p19, p20, p21, p22, and p23>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
