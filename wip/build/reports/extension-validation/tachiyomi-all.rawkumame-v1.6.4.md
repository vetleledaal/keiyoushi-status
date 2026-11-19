# Extension Validation Report

- Extension: tachiyomi-all.rawkumame-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5509878196968851775
- Source name: MangaMachina
- Source language: en
- Selected manga input: popular offset 0: Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Netorare Manga no Kuzu Otoko ni Tensei Shita Hazu ga Heroine ga Yottekuru Ken (`.../netorare-manga-no-kuzu-otoko-ni-tensei-shita-hazu-ga-heroine-ga-yottekuru-ken`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Wata ippai no ai o kudasai (`.../wata-ippai-no-ai-o-kudasai`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Otaku-kun ni dake Yasashisugiru Ayame-san (`.../otaku-kun-ni-dake-yasashisugiru-ayame-san`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Chapter 37.3 (`.../chapter-37-3`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru, URL=`tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangamachina.com/.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru.jpg` (image/jpeg, 31472 bytes, 281x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru` |  |  |  |
| details thumbnail URL | PASS | `https://mangamachina.com/.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru.jpg` |  |  |  |
| details author | PASS | INASHITA Shinai |  |  |  |
| details artist | PASS | Seiji (Friendly Land) |  |  |  |
| details genres | PASS | Action, Adult, Adventure, Comedy, Fantasy, Harem, Romance, Shounen, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Toyo Akutsu unfortunately died in an accident, but the next moment he was somehow reincarnated in the world of a famous RPG as Ashnold, the weakest of the Four Heavenly Kings. At this rate, he will lose to the Hero and die. Even if they were miraculously defeated, the Heroes would raise their level and return. To survive, he has no choice but to use the forbidden bug technique 「Betrayal Bug」 to make the Hero’s group become his followers and control their bodies and minds.<br>Will Akutsu (Ash) be able to subjugate all the heroines, build a harem, and survive the death flag event?<br><br>Alternative titles:<br>• I Got Reincarnated as a Mid-Boss Who Dies at the Start of a Game<br>• 転生したら序盤で死ぬ中ボスだった<br>• 転生したら序盤で死ぬ中ボスだった－ヒロイン眷属化で生き残る－<br>• When I Reincarnation, I Was A Mid-boss Who Died In The Game.<br>• 転生したら序盤で死ぬ中ボスだった ―ヒロイン眷属化で生き残る― |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://sihanoukville.top/.../3il9JXWT0-EUkcjJoknt52.webp data-block=\"1\" style='font-family:\"KomikaText-BoldItalic\";font-size:34px;fill:rgb(255,255,255)'>\n<text x=\"718\" y=\"97\" textLength=\"143\" lengthAdjust=\"spacingAndGlyphs\">She knows<.../n%3Ctext x=\"729\" y=\"136\" textLength=\"120\" lengthAdjust=\"spacingAndGlyphs\">my \"real\"<.../n%3Ctext x=\"733\" y=\"175\" textLength=\"113\" lengthAdjust=\"spacingAndGlyphs\">name...?!<.../n%3Cg data-block=\"2\" style='font-family:\"KomikaText-BoldItalic\";font-size:25px;fill:rgb(20,20,20);stroke:rgb(255,255,255);stroke-width:4px;stroke-linejoin:round;paint-order:stroke'>\n<text x=\"648\" y=\"290\" textLength=\"92\" lengthAdjust=\"spacingAndGlyphs\">Someone<.../n%3Ctext x=\"669\" y=\"318\" textLength=\"48\" lengthAdjust=\"spacingAndGlyphs\">from<.../n%3Ctext x=\"671\" y=\"346\" textLength=\"45\" lengthAdjust=\"spacingAndGlyphs\">back<.../n%3Ctext x=\"659\" y=\"374\" textLength=\"70\" lengthAdjust=\"spacingAndGlyphs\">then...?<.../n%3Cg data-block=\"3\" style='font-family:\"KomikaText-BoldItalic\";font-size:27px;fill:rgb(20,20,20)'>\n<text x=\"124\" y=\"258\" textLength=\"44\" lengthAdjust=\"spacingAndGlyphs\">No...<.../n%3Ctext x=\"123\" y=\"289\" textLength=\"45\" lengthAdjust=\"spacingAndGlyphs\">How<.../n%3Ctext x=\"117\" y=\"320\" textLength=\"58\" lengthAdjust=\"spacingAndGlyphs\">could<.../n%3Ctext x=\"126\" y=\"351\" textLength=\"38\" lengthAdjust=\"spacingAndGlyphs\">she<.../n%3Ctext x=\"122\" y=\"382\" textLength=\"47\" lengthAdjust=\"spacingAndGlyphs\">even<.../n%3Ctext x=\"129\" y=\"413\" textLength=\"34\" lengthAdjust=\"spacingAndGlyphs\">tell<.../n%3Ctext x=\"119\" y=\"444\" textLength=\"52\" lengthAdjust=\"spacingAndGlyphs\">right<.../n%3Ctext x=\"108\" y=\"475\" textLength=\"74\" lengthAdjust=\"spacingAndGlyphs\">now...?!<.../n%3Cg data-block=\"4\" style='font-family:\"KomikaText-KapsBold\";font-size:28px;fill:rgb(20,20,20)'>\n<text x=\"763\" y=\"596\" textLength=\"70\" lengthAdjust=\"spacingAndGlyphs\">I knew<.../n%3Ctext x=\"789\" y=\"628\" textLength=\"22\" lengthAdjust=\"spacingAndGlyphs\">it.<.../n%3Cg data-block=\"5\" style='font-family:\"KomikaText-KapsBold\";font-size:28px;fill:rgb(20,20,20)'>\n<text x=\"659\" y=\"698\" textLength=\"74\" lengthAdjust=\"spacingAndGlyphs\">You're<.../n%3Ctext x=\"655\" y=\"730\" textLength=\"88\" lengthAdjust=\"spacingAndGlyphs\">Akutsu,<.../n%3Ctext x=\"662\" y=\"762\" textLength=\"74\" lengthAdjust=\"spacingAndGlyphs\">right?<.../n%3Cg data-block=\"6\" style='font-family:\"KomikaText-KapsBold\";font-size:24px;fill:rgb(20,20,20)'>\n<text x=\"575\" y=\"1082\" textLength=\"46\" lengthAdjust=\"spacingAndGlyphs\">Just<.../n%3Ctext x=\"573\" y=\"1109\" textLength=\"53\" lengthAdjust=\"spacingAndGlyphs\">who...<.../n%3Cg data-block=\"7\" style='font-family:\"KomikaText-KapsBold\";font-size:24px;fill:rgb(20,20,20)'>\n<text x=\"463\" y=\"1143\" textLength=\"47\" lengthAdjust=\"spacingAndGlyphs\">...are<.../n%3Ctext x=\"466\" y=\"1170\" textLength=\"48\" lengthAdjust=\"spacingAndGlyphs\">you?<.../g%3E%22%7D` (image/jpeg, 405213 bytes, 960x1365; server Content-Type: image/webp) |  |  |  |
