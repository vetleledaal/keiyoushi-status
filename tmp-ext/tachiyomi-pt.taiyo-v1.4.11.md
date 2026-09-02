# Extension Validation Report

- Extension: tachiyomi-pt.taiyo-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7387610647818309943
- Source name: Taiyō
- Source language: pt-BR
- Selected manga input: popular offset 0: I am the only the one who levels up (`.../17b03940-450b-4b34-a904-e9b296daee9a`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | I am the only the one who levels up (`.../17b03940-450b-4b34-a904-e9b296daee9a`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 21 | Evangelion (`.../df6462cb-1714-44ef-a4bb-7356adf94c8a`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 21 | I am the only the one who levels up (`.../17b03940-450b-4b34-a904-e9b296daee9a`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Solo Leveling (`.../17b03940-450b-4b34-a904-e9b296daee9a`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 201 | Capítulo 0 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I am the only the one who levels up, URL=`.../17b03940-450b-4b34-a904-e9b296daee9a` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://taiyo.moe/.../image <redacted query values: url, w, and q>` (image/jpeg, 25798 bytes, 256x346) |  |  |  |
| details identity | UNUSUAL | Details changed selected title I am the only the one who levels up to Solo Leveling |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://taiyo.moe/.../image <redacted query values: url, w, and q>` (image/jpeg, 51209 bytes, 384x518) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Drama, Fantasia, Sobrenatural |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Dez anos atrás, depois do "Portal" que conecta o mundo real com um mundo de montros se abriu, algumas pessoas comuns receberam o poder de caçar os monstros do portal. Eles são conhecidos como caçadores. Porém, nem todos os caçadores são fortes. Meu nome é Sung Jin-Woo, um caçador de rank E. Eu sou alguém que tem que arriscar a própria vida nas dungeons mais fracas, "O mais fraco do mundo". Sem ter nenhuma habilidade à disposição, eu mal consigo dinheiro nas dungeons de baixo nível… Ao menos até eu encontrar uma dungeon escondida com a maior dificuldade dentro do Rank D! No fim, enquanto aceitava minha morte, eu ganhei um novo poder… --- - \[1st Trailer\](https://www.youtube.com/.../watch <redacted query values: v>) \| \[ENG\](https://www.youtube.com/.../watch <redacted query values: v>) \| \[JP\](https://www.youtube.com/.../watch <redacted query values: v>) - \[2nd Trailer\](https://www.youtube.com/.../watch <redacted query values: v>) \| \[ENG\](https://www.youtube.com/.../watch <redacted query values: v>) \| \[JP\](https://www.youtube.com/.../watch <redacted query values: v>) - \[S2 <Return> PV\](https://www.youtube.com/.../watch <redacted query values: v>) - \[Original Webtoon <Webtoon kakao>\](https://webtoon.kakao.com/.../2320) --- - \[Original Book <Yes24>\](http://www.yes24.com/.../78527123) - \[Original Book <Aladin>\](https://www.aladin.co.kr/.../wproduct.aspx <redacted query values: ItemId>) > - \[Book <Japanese Edition>\](https://www.kadokawa.co.jp/.../321906000298) - \[Book <German Edition>\](https://altraverse.de/.../solo-leveling) - \[Book <English Edition>\](https://yenpress.com/.../search-list <redacted query values: keyword>) - \[Book <Italian Edition>\](https://www.starcomics.com/.../solo-leveling) --- - Official English Translation \[<Pocket Comics>\](https://www.pocketcomics.com/.../320) \| \[<WebNovel>\](https://www.webnovel.com/.../only-i-level-up-(solo-leveling)_15227640605485101) \| \[<Tapas>\](https://tapas.io/.../info) - \[Official Traditional Chinese Translation\](https://tw.kakaowebtoon.com/.../53) - \[Official Simplified Chinese Translation\](https://www.kuaikanmanhua.com/.../4319) - \[Official Indonesian Translation\](https://kakaopage.co.id/.../3375) - \[Official Japanese Translation\](https://piccoma.com/.../5523) - \[Official French Translation\](https://www.verytoon.com/.../solo-leveling) - \[Official Thai Translation\](https://th.kakaowebtoon.com/.../48) --- - \[Original LNovel Book <Aladin>\](https://www.aladin.co.kr/.../wproduct.aspx <redacted query values: ItemId>) - \[Original LNovel Book <Yes24>\](http://www.yes24.com/.../78213344) > - <Japanese Edition> \[Web\](https://piccoma.com/.../18836) \| \[Book\](https://www.kadokawa.co.jp/.../322009000190) - <English Edition> \[Web\](https://www.webnovel.com/.../only-i-level-up-(solo-leveling)_12507348206677105) \| \[Book\](https://yenpress.com/.../series-search <redacted query values: series>) - \[<German Edition>\](https://altraverse.de/.../solo-leveling)<br><br>Títulos alternativos:<br>	Portuguese: Jogador solo<br>	Indonesian: Grinding Sendiri<br>	Indonesian: Aku Level Up Sendiri<br>	Tamil: சோலோ லெவெலிங்<br>	Georgian: სოლო ლეველინგი<br>	English: I Alone Level-Up<br>	English: I am the only the one who levels up<br>	English: I level up alone<br>	English: Only I Level up<br>	English: Solo Leveling<br>	Korean: 나 혼자만 레벨업<br>	Korean: Na Honjaman Level-Up<br>	Korean: Na Honjaman Lebel-eob<br>	Romanian: Singur îmi ridic nivelul<br>	Persian: تکرو<br>	Persian: سولو لولینگ<br>	Nepali: सोलो लेभलिङ<br>	Japanese: Ore Dake Level Up na Ken<br>	Japanese: 俺だけレベルアップな件〜外伝〜<br>	Japanese: 俺だけレベルアップな件<br>	Chinese: 我独自升级<br>	Chinese: 我獨自升級<br>	Latin: Solo Adtritio<br>	Turkish: Tek başına seviye atlama<br>	Turkish: Ben yanlız gelişirim<br>	Turkish: Sadece Ben Seviye Atlayabiliyorum<br>	Turkish: Yalnız Seviye Atlama<br>	Hindi: सोलो लेवलिंग<br>	Hindi: केवल मैं स्तर बढ़ाता हूं<br>	Arabic: الإرتقاء بالمستوى منفردًا<br>	Arabic: سولو ليفيلنغ<br>	Bangla: সোলো লেভেলিং<br>	Hebrew: שחקן בודד<br>	Hungarian: Egyéni szintlépés<br>	Russian: Поднятие уровня в одиночку<br>	Portuguese: Upando sozinho<br>	Ukrainian: Тільки я візьму новий рівень |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 201 chapters |  |  |  |
| chapter dates | PASS | 201 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.taiyo.moe/.../34b25043-1aa3-4b51-929c-fc4d2f54affa.jpg` (image/jpeg, 88596 bytes, 534x788) |  |  |  |
