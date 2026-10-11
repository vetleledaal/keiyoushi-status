# Extension Validation Report

- Extension: tachiyomi-ja.cmoa-v1.6.1
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
- Source ID: 1222039348961733003
- Source name: C'moA
- Source language: ja
- Selected manga input: popular offset 0: 捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC (`.../328265`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 200 | 捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC (`.../328265`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 90 | 31年分の恋 (`.../349738`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 90 | 寝取られアンジェニカと鬼畜伯爵［ばら売り］ (`.../338177`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 【単話版】捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC (`.../326557`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC (`.../328265`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 🔒 (Preview) 第1巻 (`.../100003282650001`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Could not find chapter ID | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Could not find chapter ID | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 90 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=捨てられ公爵夫人は、平穏な生活をお望みのようです@COMIC, URL=`328265` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 382/382 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 382/382 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cmoa.akamaized.net/.../100003282650003.jpg` (image/jpeg, 22532 bytes, 180x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `328265` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cmoa.akamaized.net/.../100003282650001.jpg` (image/jpeg, 20696 bytes, 180x256) |  |  |  |
| details author | PASS | 柑奈まち, カレヤタミエ, 駒田ハチ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女マンガ, ファンタジー, 異世界・転生, 広告掲載中, シーモア限定特典付き, 電子特典付き, ファンタジー, 異世界・転生, 広告掲載中, シーモア限定特典付き, 電子特典付き |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 『このライトノベルがすごい！２０２６』（宝島社刊） 新作単行本・ノベルズ部門第2位／単行本・ノベルズ部門第15位 小説家になろう年間第１位（２０２４年４月～１０月） ２０２４年もっとも読まれた超人気作、待望のコミカライズ第１巻！ 「私だって――勝手に幸せになってやる」 運命に泣き寝入りなどするものか。 したたか夫人の領地改革ヒューマン・ファンタジー！ 描き下ろし漫画＆原作・カレヤタミエ先生による書き下ろし小説豪華W収録！ 「君を愛するつもりはない」 結婚式直後、夫になったばかりのアレクシスから冷たく言い渡された公爵夫人・メルフィーナ。 彼女には前世の記憶があり、ここが乙女ゲームの世界であることを知っていた。 この先、悪役令嬢として破滅する未来が待ち受けていることも。 ――理不尽な運命に泣き寝入りなどするものか。 「私だって、勝手に幸せになってやる！」 交渉の末、北方の僻地・エンカ―地方を手に入れると、新たな領主として【領地改革】を開始する。 未開の土地。厳しい封建制の現実。迫りくる飢饉……。 様々な困難に直面しながらも、次々と新たな挑戦を繰り出すメルフィーナのひたむきな姿は、やがて周囲の人々の心に温かな光を灯していき――。 運命に抗い、この手で未来を変えていく。 したたか夫人の領地改革ヒューマン・ファンタジー、開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | All 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Could not find chapter ID |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://www.cmoa.jp/.../100003282650001` to `https://www.cmoa.jp/.../speedreader <redacted query values: cid, u0, and rurl>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
